package com.example.cupcake.databinding;
import com.example.cupcake.R;
import com.example.cupcake.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPickupBindingImpl extends FragmentPickupBinding implements com.example.cupcake.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.date_options, 8);
        sViewsWithIds.put(R.id.divider, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPickupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentPickupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[6]
            , (android.widget.RadioGroup) bindings[8]
            , (android.view.View) bindings[9]
            , (android.widget.Button) bindings[7]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.option0.setTag(null);
        this.option1.setTag(null);
        this.option2.setTag(null);
        this.option3.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.cupcake.generated.callback.OnClickListener(this, 5);
        mCallback13 = new com.example.cupcake.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.example.cupcake.generated.callback.OnClickListener(this, 1);
        mCallback16 = new com.example.cupcake.generated.callback.OnClickListener(this, 6);
        mCallback14 = new com.example.cupcake.generated.callback.OnClickListener(this, 4);
        mCallback12 = new com.example.cupcake.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.pickupFragment == variableId) {
            setPickupFragment((com.example.cupcake.PickupFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.cupcake.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPickupFragment(@Nullable com.example.cupcake.PickupFragment PickupFragment) {
        this.mPickupFragment = PickupFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.pickupFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.cupcake.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelDateEqualsViewModelDateOptions3 = false;
        java.lang.String viewModelDateOptions3 = null;
        java.lang.String viewModelDateOptions1 = null;
        com.example.cupcake.PickupFragment pickupFragment = mPickupFragment;
        java.lang.String subtotalAndroidStringSubtotalPriceViewModelPrice = null;
        boolean viewModelDateEqualsViewModelDateOptions1 = false;
        androidx.lifecycle.LiveData<java.lang.String> viewModelPrice = null;
        boolean viewModelDateEqualsViewModelDateOptions0 = false;
        boolean viewModelDateEqualsViewModelDateOptions2 = false;
        androidx.lifecycle.LiveData<java.lang.String> viewModelDate = null;
        java.util.List<java.lang.String> viewModelDateOptions = null;
        java.lang.String viewModelDateOptions0 = null;
        java.lang.String viewModelDateOptions2 = null;
        java.lang.String viewModelPriceGetValue = null;
        com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelDateGetValue = null;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.price
                        viewModelPrice = viewModel.getPrice();
                    }
                    updateLiveDataRegistration(0, viewModelPrice);


                    if (viewModelPrice != null) {
                        // read viewModel.price.getValue()
                        viewModelPriceGetValue = viewModelPrice.getValue();
                    }


                    // read @android:string/subtotal_price
                    subtotalAndroidStringSubtotalPriceViewModelPrice = subtotal.getResources().getString(R.string.subtotal_price, viewModelPriceGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.date
                        viewModelDate = viewModel.getDate();
                        // read viewModel.dateOptions
                        viewModelDateOptions = viewModel.getDateOptions();
                    }
                    updateLiveDataRegistration(1, viewModelDate);


                    if (viewModelDate != null) {
                        // read viewModel.date.getValue()
                        viewModelDateGetValue = viewModelDate.getValue();
                    }
                    if (viewModelDateOptions != null) {
                        // read viewModel.dateOptions[3]
                        viewModelDateOptions3 = getFromList(viewModelDateOptions, 3);
                        // read viewModel.dateOptions[1]
                        viewModelDateOptions1 = getFromList(viewModelDateOptions, 1);
                        // read viewModel.dateOptions[0]
                        viewModelDateOptions0 = getFromList(viewModelDateOptions, 0);
                        // read viewModel.dateOptions[2]
                        viewModelDateOptions2 = getFromList(viewModelDateOptions, 2);
                    }


                    if (viewModelDateGetValue != null) {
                        // read viewModel.date.getValue().equals(viewModel.dateOptions[3])
                        viewModelDateEqualsViewModelDateOptions3 = viewModelDateGetValue.equals(viewModelDateOptions3);
                        // read viewModel.date.getValue().equals(viewModel.dateOptions[1])
                        viewModelDateEqualsViewModelDateOptions1 = viewModelDateGetValue.equals(viewModelDateOptions1);
                        // read viewModel.date.getValue().equals(viewModel.dateOptions[0])
                        viewModelDateEqualsViewModelDateOptions0 = viewModelDateGetValue.equals(viewModelDateOptions0);
                        // read viewModel.date.getValue().equals(viewModel.dateOptions[2])
                        viewModelDateEqualsViewModelDateOptions2 = viewModelDateGetValue.equals(viewModelDateOptions2);
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback15);
            this.nextButton.setOnClickListener(mCallback16);
            this.option0.setOnClickListener(mCallback11);
            this.option1.setOnClickListener(mCallback12);
            this.option2.setOnClickListener(mCallback13);
            this.option3.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.option0, viewModelDateEqualsViewModelDateOptions0);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.option1, viewModelDateEqualsViewModelDateOptions1);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.option2, viewModelDateEqualsViewModelDateOptions2);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.option3, viewModelDateEqualsViewModelDateOptions3);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option0, viewModelDateOptions0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option1, viewModelDateOptions1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option2, viewModelDateOptions2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option3, viewModelDateOptions3);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalPriceViewModelPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // pickupFragment != null
                boolean pickupFragmentJavaLangObjectNull = false;
                // pickupFragment
                com.example.cupcake.PickupFragment pickupFragment = mPickupFragment;



                pickupFragmentJavaLangObjectNull = (pickupFragment) != (null);
                if (pickupFragmentJavaLangObjectNull) {


                    pickupFragment.cancelOrder();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.dateOptions[2]
                java.lang.String viewModelDateOptions2 = null;
                // viewModel.dateOptions
                java.util.List<java.lang.String> viewModelDateOptions = null;
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.dateOptions != null
                boolean viewModelDateOptionsJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelDateOptions = viewModel.getDateOptions();

                    viewModelDateOptionsJavaLangObjectNull = (viewModelDateOptions) != (null);
                    if (viewModelDateOptionsJavaLangObjectNull) {



                        viewModelDateOptions2 = getFromList(viewModelDateOptions, 2);

                        viewModel.setDate(viewModelDateOptions2);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.dateOptions
                java.util.List<java.lang.String> viewModelDateOptions = null;
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel.dateOptions[0]
                java.lang.String viewModelDateOptions0 = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.dateOptions != null
                boolean viewModelDateOptionsJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelDateOptions = viewModel.getDateOptions();

                    viewModelDateOptionsJavaLangObjectNull = (viewModelDateOptions) != (null);
                    if (viewModelDateOptionsJavaLangObjectNull) {



                        viewModelDateOptions0 = getFromList(viewModelDateOptions, 0);

                        viewModel.setDate(viewModelDateOptions0);
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // pickupFragment != null
                boolean pickupFragmentJavaLangObjectNull = false;
                // pickupFragment
                com.example.cupcake.PickupFragment pickupFragment = mPickupFragment;



                pickupFragmentJavaLangObjectNull = (pickupFragment) != (null);
                if (pickupFragmentJavaLangObjectNull) {


                    pickupFragment.goToNextScreen();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.dateOptions[3]
                java.lang.String viewModelDateOptions3 = null;
                // viewModel.dateOptions
                java.util.List<java.lang.String> viewModelDateOptions = null;
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.dateOptions != null
                boolean viewModelDateOptionsJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelDateOptions = viewModel.getDateOptions();

                    viewModelDateOptionsJavaLangObjectNull = (viewModelDateOptions) != (null);
                    if (viewModelDateOptionsJavaLangObjectNull) {



                        viewModelDateOptions3 = getFromList(viewModelDateOptions, 3);

                        viewModel.setDate(viewModelDateOptions3);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.dateOptions[1]
                java.lang.String viewModelDateOptions1 = null;
                // viewModel.dateOptions
                java.util.List<java.lang.String> viewModelDateOptions = null;
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.dateOptions != null
                boolean viewModelDateOptionsJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelDateOptions = viewModel.getDateOptions();

                    viewModelDateOptionsJavaLangObjectNull = (viewModelDateOptions) != (null);
                    if (viewModelDateOptionsJavaLangObjectNull) {



                        viewModelDateOptions1 = getFromList(viewModelDateOptions, 1);

                        viewModel.setDate(viewModelDateOptions1);
                    }
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
        flag 2 (0x3L): pickupFragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}