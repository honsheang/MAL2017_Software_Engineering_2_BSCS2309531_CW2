package com.example.restaurantapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        Button signUpButton = findViewById(R.id.button4);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an alert dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
                builder.setMessage("Are you confirm with your information?")
                        .setCancelable(false)
                        .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Redirect to DashboardActivity and show success message
                                Toast.makeText(SignUp.this, "Sign Up Successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SignUp.this, Dashboard.class);//create
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Dismiss the dialog and go back to the previous activity
                                dialog.dismiss();
                                onBackPressed(); // Goes back to the previous activity
                            }
                        });

                // Create and show the alert dialog
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        TextView toLogin = findViewById(R.id.textView15);
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });


    }
}
