// Generated by data binding compiler. Do not edit!
package com.example.screen_search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.screen_search.R;
import com.example.torang_core.data.model.Search;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSuggestBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @Bindable
  protected Search mKeyword;

  protected ItemSuggestBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView3, TextView textView2, TextView textView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView3 = imageView3;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  public abstract void setKeyword(@Nullable Search keyword);

  @Nullable
  public Search getKeyword() {
    return mKeyword;
  }

  @NonNull
  public static ItemSuggestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_suggest, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSuggestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSuggestBinding>inflateInternal(inflater, R.layout.item_suggest, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSuggestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_suggest, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSuggestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSuggestBinding>inflateInternal(inflater, R.layout.item_suggest, null, false, component);
  }

  public static ItemSuggestBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemSuggestBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSuggestBinding)bind(component, view, R.layout.item_suggest);
  }
}