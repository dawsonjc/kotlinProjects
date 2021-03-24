package com.example.cupcake.databinding;
import com.example.cupcake.R;
import com.example.cupcake.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSummaryBindingImpl extends FragmentSummaryBinding implements com.example.cupcake.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.quantity_label, 8);
        sViewsWithIds.put(R.id.divider1, 9);
        sViewsWithIds.put(R.id.flavor_label, 10);
        sViewsWithIds.put(R.id.divider2, 11);
        sViewsWithIds.put(R.id.pickup_label, 12);
        sViewsWithIds.put(R.id.divider3, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSummaryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentSummaryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.cancelButton.setTag(null);
        this.date.setTag(null);
        this.flavor.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.orderButton.setTag(null);
        this.quantity.setTag(null);
        this.sendButton.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.example.cupcake.generated.callback.OnClickListener(this, 1);
        mCallback19 = new com.example.cupcake.generated.callback.OnClickListener(this, 3);
        mCallback18 = new com.example.cupcake.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.summaryFragment == variableId) {
            setSummaryFragment((com.example.cupcake.SummaryFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.cupcake.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSummaryFragment(@Nullable com.example.cupcake.SummaryFragment SummaryFragment) {
        this.mSummaryFragment = SummaryFragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.summaryFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.cupcake.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPrice((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelDate((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelQuantity((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelFlavor((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPrice(androidx.lifecycle.LiveData<java.lang.String> ViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDate(androidx.lifecycle.LiveData<java.lang.String> ViewModelDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuantity(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelQuantity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFlavor(androidx.lifecycle.LiveData<java.lang.String> ViewModelFlavor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Integer viewModelQuantityGetValue = null;
        com.example.cupcake.SummaryFragment summaryFragment = mSummaryFragment;
        java.lang.String viewModelFlavorGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelPrice = null;
        java.lang.String totalAndroidStringTotalPriceViewModelPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelDate = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelQuantity = null;
        java.lang.String viewModelQuantityToString = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelFlavor = null;
        java.lang.String viewModelPriceGetValue = null;
        com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelDateGetValue = null;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.price
                        viewModelPrice = viewModel.getPrice();
                    }
                    updateLiveDataRegistration(0, viewModelPrice);


                    if (viewModelPrice != null) {
                        // read viewModel.price.getValue()
                        viewModelPriceGetValue = viewModelPrice.getValue();
                    }


                    // read @android:string/total_price
                    totalAndroidStringTotalPriceViewModelPrice = total.getResources().getString(R.string.total_price, viewModelPriceGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.date
                        viewModelDate = viewModel.getDate();
                    }
                    updateLiveDataRegistration(1, viewModelDate);


                    if (viewModelDate != null) {
                        // read viewModel.date.getValue()
                        viewModelDateGetValue = viewModelDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.quantity
                        viewModelQuantity = viewModel.getQuantity();
                    }
                    updateLiveDataRegistration(2, viewModelQuantity);


                    if (viewModelQuantity != null) {
                        // read viewModel.quantity.getValue()
                        viewModelQuantityGetValue = viewModelQuantity.getValue();
                    }


                    if (viewModelQuantityGetValue != null) {
                        // read viewModel.quantity.getValue().toString()
                        viewModelQuantityToString = viewModelQuantityGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.flavor
                        viewModelFlavor = viewModel.getFlavor();
                    }
                    updateLiveDataRegistration(3, viewModelFlavor);


                    if (viewModelFlavor != null) {
                        // read viewModel.flavor.getValue()
                        viewModelFlavorGetValue = viewModelFlavor.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback19);
            this.orderButton.setOnClickListener(mCallback17);
            this.sendButton.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, viewModelDateGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.flavor, viewModelFlavorGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantity, viewModelQuantityToString);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalPriceViewModelPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // summaryFragment
                com.example.cupcake.SummaryFragment summaryFragment = mSummaryFragment;
                // summaryFragment != null
                boolean summaryFragmentJavaLangObjectNull = false;



                summaryFragmentJavaLangObjectNull = (summaryFragment) != (null);
                if (summaryFragmentJavaLangObjectNull) {


                    summaryFragment.placeOrder();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // summaryFragment
                com.example.cupcake.SummaryFragment summaryFragment = mSummaryFragment;
                // summaryFragment != null
                boolean summaryFragmentJavaLangObjectNull = false;



                summaryFragmentJavaLangObjectNull = (summaryFragment) != (null);
                if (summaryFragmentJavaLangObjectNull) {


                    summaryFragment.cancelOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // summaryFragment
                com.example.cupcake.SummaryFragment summaryFragment = mSummaryFragment;
                // summaryFragment != null
                boolean summaryFragmentJavaLangObjectNull = false;



                summaryFragmentJavaLangObjectNull = (summaryFragment) != (null);
                if (summaryFragmentJavaLangObjectNull) {


                    summaryFragment.sendOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.price
        flag 1 (0x2L): viewModel.date
        flag 2 (0x3L): viewModel.quantity
        flag 3 (0x4L): viewModel.flavor
        flag 4 (0x5L): summaryFragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}