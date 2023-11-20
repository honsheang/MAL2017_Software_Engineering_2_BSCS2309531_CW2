package com.example.restaurantapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ReservationSummary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservationsummary);
    }

    public void goBack(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        // Custom back button behavior goes here
        // For example, navigate to a specific activity or perform other actions
        super.onBackPressed(); // Don't forget to call the superclass method if needed
    }

}
