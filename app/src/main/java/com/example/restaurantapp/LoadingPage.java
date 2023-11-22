package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadingpage);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to launch the dashboard activity
                Intent intent = new Intent(LoadingPage.this, Dashboard.class);
                startActivity(intent);

                // Close this activity to prevent the user from coming back using the back button
                finish();
            }
        }, 3000);
    }
}