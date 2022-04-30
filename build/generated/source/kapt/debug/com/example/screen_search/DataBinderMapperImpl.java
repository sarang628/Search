package com.example.screen_search;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.screen_search.databinding.FragmentSearchBindingImpl;
import com.example.screen_search.databinding.ItemKeywordsBindingImpl;
import com.example.screen_search.databinding.ItemSuggestBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTSEARCH = 1;

  private static final int LAYOUT_ITEMKEYWORDS = 2;

  private static final int LAYOUT_ITEMSUGGEST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.screen_search.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.screen_search.R.layout.item_keywords, LAYOUT_ITEMKEYWORDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.screen_search.R.layout.item_suggest, LAYOUT_ITEMSUGGEST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMKEYWORDS: {
          if ("layout/item_keywords_0".equals(tag)) {
            return new ItemKeywordsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_keywords is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSUGGEST: {
          if ("layout/item_suggest_0".equals(tag)) {
            return new ItemSuggestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_suggest is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.torang_core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "keyword");
      sKeys.put(2, "search");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_search_0", com.example.screen_search.R.layout.fragment_search);
      sKeys.put("layout/item_keywords_0", com.example.screen_search.R.layout.item_keywords);
      sKeys.put("layout/item_suggest_0", com.example.screen_search.R.layout.item_suggest);
    }
  }
}
