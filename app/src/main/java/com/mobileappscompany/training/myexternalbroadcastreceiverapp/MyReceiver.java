package com.mobileappscompany.training.myexternalbroadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "My external BroRe", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }
}
