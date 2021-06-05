package com.appinbox.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.appinbox.sdk.AppInboxSDK;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {


    private static final String APP_ID = "3b4fcadb-6d4c-4038-bf17-0591d4677a7c";
    private static final String APP_KEY = "f0e56c2f-6f2c-4a38-abe3-22029afd590b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppInboxSDK.init(this, APP_ID, APP_KEY, "empid123");

        View open = findViewById(R.id.open_ai);
        View logout = findViewById(R.id.logout_ai);

        Button openInbox = new Button(this);
        open.setOnClickListener(view -> {
            AppInboxSDK.open(this, APP_ID, APP_KEY, "empid123");
        });
        logout.setOnClickListener(view -> {
            AppInboxSDK.logout(this);
        });
    }
}