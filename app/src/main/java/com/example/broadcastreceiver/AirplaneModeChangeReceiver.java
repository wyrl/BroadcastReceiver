package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AirplaneModeChangeReceiver extends BroadcastReceiver {
    final String TAG = "AirplaneModeChangeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        final boolean isAirplaneModeEnabled = intent.getBooleanExtra("state", false);

        if(isAirplaneModeEnabled){
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Airplane Mode Enabled");
        }
        else {
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Airplane Mode Disabled");
        }
    }
}
