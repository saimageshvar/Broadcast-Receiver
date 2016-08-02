package com.example.sai.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by sai on 02-08-2016.
 */
public class CustomReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        CharSequence text = intent.getStringExtra("Msg");
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    }