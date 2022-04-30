package com.example.screen_search.databinding;
import com.example.screen_search.R;
import com.example.screen_search.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding implements com.example.screen_search.generated.callback.Function0.Listener, com.example.screen_search.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.rv_keywords, 4);
    }
    // views
    // variables
    @Nullable
    private final kotlin.jvm.functions.Function0 mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.keyword.getValue()
            //         is viewModel.keyword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSearch);
            // localize variables for thread safety
            // viewModel.keyword
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelKeyword = null;
            // viewModel.keyword.getValue()
            java.lang.String viewModelKeywordGetValue = null;
            // viewModel
            com.example.screen_search.keyword.SearchViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.keyword != null
            boolean viewModelKeywordJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelKeyword = viewModel.getKeyword();

                viewModelKeywordJavaLangObjectNull = (viewModelKeyword) != (null);
                if (viewModelKeywordJavaLangObjectNull) {




                    viewModelKeyword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.etSearch.setTag(null);
        this.imageView4.setTag(null);
        this.main.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.screen_search.generated.callback.Function0(this, 1);
        mCallback2 = new com.example.screen_search.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.screen_search.keyword.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.screen_search.keyword.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelKeyword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelKeyword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelKeyword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelKeyword = null;
        java.lang.String viewModelKeywordGetValue = null;
        com.example.screen_search.keyword.SearchViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.keyword
                    viewModelKeyword = viewModel.getKeyword();
                }
                updateLiveDataRegistration(0, viewModelKeyword);


                if (viewModelKeyword != null) {
                    // read viewModel.keyword.getValue()
                    viewModelKeywordGetValue = viewModelKeyword.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSearch, viewModelKeywordGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.example.torang_core.binding_util.EdittextBindingAdapterKt.onEditorAction(this.etSearch, mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSearchandroidTextAttrChanged);
            this.imageView4.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final kotlin.Unit _internalCallbackInvoke(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.example.screen_search.keyword.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clickSearch();
        }
        return null;
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.screen_search.keyword.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clickSearch();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.keyword
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}