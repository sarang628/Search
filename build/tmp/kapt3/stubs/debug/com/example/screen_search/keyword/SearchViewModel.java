package com.example.screen_search.keyword;

import java.lang.System;

/**
 * [SearchFragment]
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/example/screen_search/keyword/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRepository", "Lcom/example/torang_core/repository/SearchRepository;", "(Lcom/example/torang_core/repository/SearchRepository;)V", "_currentKeyword", "Landroidx/lifecycle/MutableLiveData;", "", "currentKeyword", "Landroidx/lifecycle/LiveData;", "getCurrentKeyword", "()Landroidx/lifecycle/LiveData;", "historyKeywords", "", "Lcom/example/torang_core/data/model/Search;", "getHistoryKeywords", "keyword", "getKeyword", "()Landroidx/lifecycle/MutableLiveData;", "suggestKeyword", "getSuggestKeyword", "clickSearch", "", "removeKeyword", "search", "saveKeyword", "screen_search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.torang_core.repository.SearchRepository searchRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.torang_core.data.model.Search>> historyKeywords = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> suggestKeyword = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> keyword = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currentKeyword = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> currentKeyword = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.SearchRepository searchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.torang_core.data.model.Search>> getHistoryKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSuggestKeyword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getKeyword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCurrentKeyword() {
        return null;
    }
    
    public final void saveKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
    }
    
    public final void removeKeyword(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.Search search) {
    }
    
    /**
     * 검색 버튼을 클릭하거나, 입력기의 검색버튼 클릭 시 동작
     */
    public final void clickSearch() {
    }
}