package com.example.cupcake.model;

import java.lang.System;

/**
 * [OrderViewModel] holds information about a cupcake order in terms of quantity, flavor, and
 * pickup date. It also knows how to calculate the total price based on these order details.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\nJ\b\u0010$\u001a\u00020\u001dH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/example/cupcake/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_date", "Landroidx/lifecycle/MutableLiveData;", "", "_flavor", "_price", "", "_quantity", "", "date", "Landroidx/lifecycle/LiveData;", "getDate", "()Landroidx/lifecycle/LiveData;", "dateOptions", "", "getDateOptions", "()Ljava/util/List;", "flavor", "getFlavor", "price", "getPrice", "quantity", "getQuantity", "getPickupOptions", "hasNoFlavorSet", "", "resetOrder", "", "setDate", "pickupDate", "setFlavor", "desiredFlavor", "setQuantity", "numberCupcakes", "updatePrice", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _quantity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> quantity = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _flavor = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> flavor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> dateOptions = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _date = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> date = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _price = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> price = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFlavor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDateOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPrice() {
        return null;
    }
    
    /**
     * Set the quantity of cupcakes for this order.
     *
     * @param numberCupcakes to order
     */
    public final void setQuantity(int numberCupcakes) {
    }
    
    /**
     * Set the flavor of cupcakes for this order. Only 1 flavor can be selected for the whole order.
     *
     * @param desiredFlavor is the cupcake flavor as a string
     */
    public final void setFlavor(@org.jetbrains.annotations.NotNull()
    java.lang.String desiredFlavor) {
    }
    
    /**
     * Set the pickup date for this order.
     *
     * @param pickupDate is the date for pickup as a string
     */
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String pickupDate) {
    }
    
    /**
     * Returns true if a flavor has not been selected for the order yet. Returns false otherwise.
     */
    public final boolean hasNoFlavorSet() {
        return false;
    }
    
    /**
     * Reset the order by using initial default values for the quantity, flavor, date, and price.
     */
    public final void resetOrder() {
    }
    
    /**
     * Updates the price based on the order details.
     */
    private final void updatePrice() {
    }
    
    /**
     * Returns a list of date options starting with the current date and the following 3 dates.
     */
    private final java.util.List<java.lang.String> getPickupOptions() {
        return null;
    }
    
    public OrderViewModel() {
        super();
    }
}