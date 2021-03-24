package com.example.cupcake;

import java.lang.System;

/**
 * [SummaryFragment] contains a summary of the order details with a button to share the order
 * via another app.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u001a\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/cupcake/SummaryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "binding", "Lcom/example/cupcake/databinding/FragmentSummaryBinding;", "notificationId", "", "getNotificationId", "()I", "sharedViewModel", "Lcom/example/cupcake/model/OrderViewModel;", "getSharedViewModel", "()Lcom/example/cupcake/model/OrderViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "cancelOrder", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "placeOrder", "sendOrder", "app_debug"})
public final class SummaryFragment extends androidx.fragment.app.Fragment {
    private com.example.cupcake.databinding.FragmentSummaryBinding binding;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHANNEL_ID = "channel_id_example_01";
    private final int notificationId = 101;
    
    private final com.example.cupcake.model.OrderViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCHANNEL_ID() {
        return null;
    }
    
    public final int getNotificationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Submit the order by sharing out the order details to another app via an implicit intent.
     */
    public final void sendOrder() {
    }
    
    /**
     * Cancel the order and start over.
     */
    public final void cancelOrder() {
    }
    
    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void placeOrder() {
    }
    
    public SummaryFragment() {
        super();
    }
}