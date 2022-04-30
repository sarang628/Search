package com.example.screen_search.keyword

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.model.Search
import com.example.torang_core.repository.SearchRepository
import com.example.torang_core.util.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * [SearchFragment]
 */
@HiltViewModel
class SearchViewModel @Inject constructor(private val searchRepository: SearchRepository) : ViewModel() {
    val historyKeywords = searchRepository.getHistoryKeywords()
    val suggestKeyword = MutableLiveData<String>()
    val keyword = MutableLiveData<String>()
    private val _currentKeyword = MutableLiveData<String>()
    val currentKeyword: LiveData<String> = _currentKeyword

    fun saveKeyword(keyword: String) {
        viewModelScope.launch {
            Logger.d(keyword)
            try {
                searchRepository.saveHistory(keyword)
            } catch (e: Exception) {

            }
        }
    }

    fun removeKeyword(search: Search) {
        viewModelScope.launch {
            try {
                searchRepository.removeKeyword(search)
            } catch (e: Exception) {

            }
        }
    }

    /**
     * 검색 버튼을 클릭하거나, 입력기의 검색버튼 클릭 시 동작
     */
    fun clickSearch() {
        this.keyword.value?.let {
            saveKeyword(it) // 키워드 저장 요청
            this.keyword.postValue("") //키워드 초기화
            _currentKeyword.postValue(it) // 현재 키워드 변경
        }
    }
}