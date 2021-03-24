package com.example.cupcake.databinding;
import com.example.cupcake.R;
import com.example.cupcake.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStartBindingImpl extends FragmentStartBinding implements com.example.cupcake.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentStartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.orderOneCupcake.setTag(null);
        this.orderSixCupcakes.setTag(null);
        this.orderTwelveCupcakes.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.cupcake.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.cupcake.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.cupcake.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.startFragment == variableId) {
            setStartFragment((com.example.cupcake.StartFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStartFragment(@Nullable com.example.cupcake.StartFragment StartFragment) {
        this.mStartFragment = StartFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.startFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.cupcake.StartFragment startFragment = mStartFragment;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.orderOneCupcake.setOnClickListener(mCallback1);
            this.orderSixCupcakes.setOnClickListener(mCallback2);
            this.orderTwelveCupcakes.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // startFragment != null
                boolean startFragmentJavaLangObjectNull = false;
                // startFragment
                com.example.cupcake.StartFragment startFragment = mStartFragment;



                startFragmentJavaLangObjectNull = (startFragment) != (null);
                if (startFragmentJavaLangObjectNull) {



                    startFragment.orderCupcake(12);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // startFragment != null
                boolean startFragmentJavaLangObjectNull = false;
                // startFragment
                com.example.cupcake.StartFragment startFragment = mStartFragment;



                startFragmentJavaLangObjectNull = (startFragment) != (null);
                if (startFragmentJavaLangObjectNull) {



                    startFragment.orderCupcake(1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // startFragment != null
                boolean startFragmentJavaLangObjectNull = false;
                // startFragment
                com.example.cupcake.StartFragment startFragment = mStartFragment;



                startFragmentJavaLangObjectNull = (startFragment) != (null);
                if (startFragmentJavaLangObjectNull) {



                    startFragment.orderCupcake(6);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): startFragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}