package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        Button toLoading = findViewById(R.id.button3);
        toLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, LoadingPage.class);
                startActivity(intent);
            }
        });

        TextView toSignup = findViewById(R.id.textView6);
        toSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });

        TextView toForgotPassword = findViewById(R.id.textView5);
        toForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);
            }
        });


    }
}
