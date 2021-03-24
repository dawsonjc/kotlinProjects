package com.example.cupcake.databinding;
import com.example.cupcake.R;
import com.example.cupcake.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFlavorBindingImpl extends FragmentFlavorBinding implements com.example.cupcake.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.flavor_options, 9);
        sViewsWithIds.put(R.id.divider, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFlavorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentFlavorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[7]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[5]
            , (android.view.View) bindings[10]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[1]
            );
        this.cancelButton.setTag(null);
        this.chocolate.setTag(null);
        this.coffee.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.redVelvet.setTag(null);
        this.saltedCaramel.setTag(null);
        this.subtotal.setTag(null);
        this.vanilla.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.cupcake.generated.callback.OnClickListener(this, 5);
        mCallback6 = new com.example.cupcake.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.cupcake.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.example.cupcake.generated.callback.OnClickListener(this, 7);
        mCallback9 = new com.example.cupcake.generated.callback.OnClickListener(this, 6);
        mCallback7 = new com.example.cupcake.generated.callback.OnClickListener(this, 4);
        mCallback5 = new com.example.cupcake.generated.callback.OnClickListener(this, 2);
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
        if (BR.flavorFragment == variableId) {
            setFlavorFragment((com.example.cupcake.FlavorFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.cupcake.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlavorFragment(@Nullable com.example.cupcake.FlavorFragment FlavorFragment) {
        this.mFlavorFragment = FlavorFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.flavorFragment);
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
    private boolean onChangeViewModelFlavor(androidx.lifecycle.LiveData<java.lang.String> ViewModelFlavor, int fieldId) {
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
        boolean viewModelFlavorEqualsCoffeeAndroidStringCoffee = false;
        boolean viewModelFlavorEqualsSaltedCaramelAndroidStringSaltedCaramel = false;
        com.example.cupcake.FlavorFragment flavorFragment = mFlavorFragment;
        boolean viewModelFlavorEqualsVanillaAndroidStringVanilla = false;
        boolean viewModelFlavorEqualsRedVelvetAndroidStringRedVelvet = false;
        java.lang.String viewModelFlavorGetValue = null;
        java.lang.String subtotalAndroidStringSubtotalPriceViewModelPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelFlavor = null;
        java.lang.String viewModelPriceGetValue = null;
        com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
        boolean viewModelFlavorEqualsChocolateAndroidStringChocolate = false;

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
                        // read viewModel.flavor
                        viewModelFlavor = viewModel.getFlavor();
                    }
                    updateLiveDataRegistration(1, viewModelFlavor);


                    if (viewModelFlavor != null) {
                        // read viewModel.flavor.getValue()
                        viewModelFlavorGetValue = viewModelFlavor.getValue();
                    }


                    if (viewModelFlavorGetValue != null) {
                        // read viewModel.flavor.getValue().equals(@android:string/coffee)
                        viewModelFlavorEqualsCoffeeAndroidStringCoffee = viewModelFlavorGetValue.equals(coffee.getResources().getString(R.string.coffee));
                        // read viewModel.flavor.getValue().equals(@android:string/salted_caramel)
                        viewModelFlavorEqualsSaltedCaramelAndroidStringSaltedCaramel = viewModelFlavorGetValue.equals(saltedCaramel.getResources().getString(R.string.salted_caramel));
                        // read viewModel.flavor.getValue().equals(@android:string/vanilla)
                        viewModelFlavorEqualsVanillaAndroidStringVanilla = viewModelFlavorGetValue.equals(vanilla.getResources().getString(R.string.vanilla));
                        // read viewModel.flavor.getValue().equals(@android:string/red_velvet)
                        viewModelFlavorEqualsRedVelvetAndroidStringRedVelvet = viewModelFlavorGetValue.equals(redVelvet.getResources().getString(R.string.red_velvet));
                        // read viewModel.flavor.getValue().equals(@android:string/chocolate)
                        viewModelFlavorEqualsChocolateAndroidStringChocolate = viewModelFlavorGetValue.equals(chocolate.getResources().getString(R.string.chocolate));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback9);
            this.chocolate.setOnClickListener(mCallback5);
            this.coffee.setOnClickListener(mCallback8);
            this.nextButton.setOnClickListener(mCallback10);
            this.redVelvet.setOnClickListener(mCallback6);
            this.saltedCaramel.setOnClickListener(mCallback7);
            this.vanilla.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chocolate, viewModelFlavorEqualsChocolateAndroidStringChocolate);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.coffee, viewModelFlavorEqualsCoffeeAndroidStringCoffee);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.redVelvet, viewModelFlavorEqualsRedVelvetAndroidStringRedVelvet);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.saltedCaramel, viewModelFlavorEqualsSaltedCaramelAndroidStringSaltedCaramel);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.vanilla, viewModelFlavorEqualsVanillaAndroidStringVanilla);
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
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setFlavor(coffee.getResources().getString(R.string.coffee));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setFlavor(redVelvet.getResources().getString(R.string.red_velvet));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setFlavor(vanilla.getResources().getString(R.string.vanilla));
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // flavorFragment
                com.example.cupcake.FlavorFragment flavorFragment = mFlavorFragment;
                // flavorFragment != null
                boolean flavorFragmentJavaLangObjectNull = false;



                flavorFragmentJavaLangObjectNull = (flavorFragment) != (null);
                if (flavorFragmentJavaLangObjectNull) {


                    flavorFragment.goToNextScreen();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // flavorFragment
                com.example.cupcake.FlavorFragment flavorFragment = mFlavorFragment;
                // flavorFragment != null
                boolean flavorFragmentJavaLangObjectNull = false;



                flavorFragmentJavaLangObjectNull = (flavorFragment) != (null);
                if (flavorFragmentJavaLangObjectNull) {


                    flavorFragment.cancelOrder();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setFlavor(saltedCaramel.getResources().getString(R.string.salted_caramel));
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.cupcake.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setFlavor(chocolate.getResources().getString(R.string.chocolate));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.price
        flag 1 (0x2L): viewModel.flavor
        flag 2 (0x3L): flavorFragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}