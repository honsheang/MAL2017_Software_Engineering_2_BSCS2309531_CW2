package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    private String verificationCode; // Store the generated verification code globally

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        final EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress3);
        final EditText editTextVerificationCode = findViewById(R.id.editTextNumber);
        Button btnSendCode = findViewById(R.id.button10);
        Button btnSubmit = findViewById(R.id.button11);
        TextView veriCode = findViewById(R.id.textView67);
        TextView backLogin = findViewById(R.id.textView68);
        EditText editTextNumber = findViewById(R.id.editTextNumber);

        btnSendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered email
                String email = editTextEmail.getText().toString().trim();

                if (email.isEmpty()) {
                    Toast.makeText(ForgotPassword.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else {
                    // Generate a random verification code
                    verificationCode = generateRandomCode();

                    // TODO: Send the verification code to the user's email using your preferred method (e.g., email service)
                    // For the example, just show the verification code in a toast
                    Toast.makeText(ForgotPassword.this, "Verification code: " + verificationCode, Toast.LENGTH_LONG).show();
                }

                veriCode.setVisibility(View.VISIBLE);

                editTextNumber.setVisibility(View.VISIBLE);
                btnSubmit.setVisibility(View.VISIBLE);

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered verification code
                String enteredCode = editTextVerificationCode.getText().toString().trim();

                if (enteredCode.equals(verificationCode)) {
                    // Verification code matches, proceed to another activity or action (e.g., login)
                    Toast.makeText(ForgotPassword.this, "Verification successful! Proceed to the next step", Toast.LENGTH_SHORT).show();
                    backLogin.setVisibility(View.VISIBLE);
                } else {
                    // Verification code does not match, display an error message
                    Toast.makeText(ForgotPassword.this, "Incorrect verification code", Toast.LENGTH_SHORT).show();
                }
            }
        });


        backLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPassword.this, Login.class);
                startActivity(intent);
            }
        });
    }

    // Method to generate a random code
    private String generateRandomCode() {
        // Implement your random code generation logic here
        // For example purposes, generating a simple 4-digit code
        int min = 1000;
        int max = 9999;
        return String.valueOf((int) (Math.random() * (max - min + 1)) + min);
    }
}
