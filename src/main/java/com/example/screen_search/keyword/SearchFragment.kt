package com.example.screen_search.keyword

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.screen_search.databinding.FragmentSearchBinding
import com.example.torang_core.util.Logger
import dagger.hilt.android.AndroidEntryPoint


/**
 * [FragmentSearchBinding]
 */
@AndroidEntryPoint
class SearchFragment : Fragment() {
    lateinit var binding: FragmentSearchBinding

    lateinit var imm: InputMethodManager

    var viewContainer: ViewGroup? = null

    private val searchViewModel: SearchViewModel by viewModels()

    /** 공유 뷰모델 */
//    private val mapSharedViewModel: MapSharedViewModel by activityViewModels()

    /*private val keywordAdapter = object : KeywordAdapter() {
        public override fun clickDelete(search: Search) {
            Logger.d(search.toString())
            searchViewModel.removeKeyword(search)
        }

        public override fun clickKeyword(keyword: Search) {
            Logger.d(keyword.toString())
            searchViewModel.keyword.value = keyword.keyword
        }
    }*/

    private fun showKeyboard() {
        imm.showSoftInput(binding.etSearch, InputMethodManager.SHOW_IMPLICIT);
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        Logger.d("")
        viewContainer = container
        imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = searchViewModel
        //binding.rvKeywords.adapter = keywordAdapter

        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
        subScribeUI()

        binding.etSearch.postDelayed(Runnable {
            binding.etSearch.requestFocus()
            showKeyboard()
        }, 100)

        return binding.root
    }


    private fun subScribeUI() {
        searchViewModel.historyKeywords.observe(requireActivity(), {
            it?.let {
                //keywordAdapter.setKeywords(it)
            }
        })
        searchViewModel.suggestKeyword.observe(requireActivity(), { s: String? ->
        })

        searchViewModel.currentKeyword.observe(viewLifecycleOwner, {
            it?.let {
                //mapSharedViewModel.search(it)
                requireActivity().onBackPressed()
            }
        })
    }

    override fun onDetach() {
        super.onDetach()
        imm.hideSoftInputFromWindow(viewContainer?.windowToken, 0);
    }
}