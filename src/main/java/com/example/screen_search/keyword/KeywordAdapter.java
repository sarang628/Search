package com.example.screen_search.keyword;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.torang_core.data.model.Search;

import java.util.ArrayList;
import java.util.List;

abstract class KeywordAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    abstract void clickDelete(Search search);

    abstract void clickKeyword(Search keyword);

    boolean isSearching = false;
    private List<Search> keywords = new ArrayList<>();

    public void setKeywords(List<Search> keywords) {
        this.keywords = keywords;
        notifyDataSetChanged();
    }

    public void setSearching(boolean searching) {
        if (isSearching != searching) {
            isSearching = searching;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (isSearching)
            return 1;
        else return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0)
            return KeyWordHolder.create(parent);
        else
            return SuggestHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof KeyWordHolder) {
            ((KeyWordHolder) holder).itemKeywordsBinding.setSearch(keywords.get(position));
            ((KeyWordHolder) holder).itemKeywordsBinding.imageView2.setOnClickListener(view -> clickDelete(keywords.get(position)));
            ((KeyWordHolder) holder).itemKeywordsBinding.textView.setOnClickListener(view -> clickKeyword(keywords.get(position)));
        } else {
            ((SuggestHolder) holder).itemSuggestBinding.setKeyword(keywords.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return keywords.size();
    }
}
