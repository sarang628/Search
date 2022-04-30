package com.example.screen_search.keyword;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.screen_search.databinding.ItemKeywordsBinding;

class KeyWordHolder extends RecyclerView.ViewHolder {
    public ItemKeywordsBinding itemKeywordsBinding;

    public static KeyWordHolder create(ViewGroup parent) {
        return new KeyWordHolder(ItemKeywordsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    public KeyWordHolder(@NonNull ItemKeywordsBinding itemKeywordsBinding) {
        super(itemKeywordsBinding.getRoot());
        this.itemKeywordsBinding = itemKeywordsBinding;
    }
}
