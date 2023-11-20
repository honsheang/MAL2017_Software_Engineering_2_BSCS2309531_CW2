package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboardingpage);

        Button toSignup = findViewById(R.id.button2);
        toSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(OnBoardingActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        Button toLogin = findViewById(R.id.button);
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(OnBoardingActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
