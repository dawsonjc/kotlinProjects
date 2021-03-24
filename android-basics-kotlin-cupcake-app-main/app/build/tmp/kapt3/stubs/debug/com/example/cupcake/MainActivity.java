package com.example.cupcake;

import java.lang.System;

/**
 * Activity for cupcake order flow.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0003J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/cupcake/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "navController", "Landroidx/navigation/NavController;", "notificationId", "", "getNotificationId", "()I", "createNotificationChannel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "sendNotification", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHANNEL_ID = "channel_id_example_01";
    private final int notificationId = 101;
    private androidx.navigation.NavController navController;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCHANNEL_ID() {
        return null;
    }
    
    public final int getNotificationId() {
        return 0;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel() {
    }
    
    public final void sendNotification() {
    }
    
    /**
     * Handle navigation when the user chooses Up from the action bar.
     */
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}