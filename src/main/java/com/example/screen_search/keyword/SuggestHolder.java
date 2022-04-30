package com.example.screen_search.keyword;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screen_search.databinding.ItemSuggestBinding;

public class SuggestHolder extends RecyclerView.ViewHolder {
    public ItemSuggestBinding itemSuggestBinding;

    public static SuggestHolder create(ViewGroup parent) {
        return new SuggestHolder(ItemSuggestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    public SuggestHolder(@NonNull ItemSuggestBinding itemSuggestBinding) {
        super(itemSuggestBinding.getRoot());
        this.itemSuggestBinding = itemSuggestBinding;
    }
}
