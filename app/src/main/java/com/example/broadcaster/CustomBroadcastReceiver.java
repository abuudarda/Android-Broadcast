package com.example.broadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {
    TextView tv;
    CustomBroadcastReceiver(TextView tv){
        this.tv=tv;
    }
    public static final String CUSTOM_ACTION = "com.example.broadcaster.CUSTOM_ACTION";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "broadcast received", Toast.LENGTH_SHORT).show();
//        if (intent.getAction().equals(CUSTOM_ACTION)) {
            String message = intent.getStringExtra("message");
//            Log.d("CustomBroadcastReceiver", message);

            // Update UI here
//            updateUI(message);
            tv.setText(message);

//        }
    }
}
