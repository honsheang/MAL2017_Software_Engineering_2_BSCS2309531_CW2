package com.example.restaurantapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ReservationSummary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservationsummary);

        Button reservationButton = findViewById(R.id.button8);
        reservationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create an alert dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(ReservationSummary.this);
                builder.setMessage("Are you confirm with reservation?")
                        .setCancelable(false)
                        .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Redirect to DashboardActivity and show success message
                                Toast.makeText(ReservationSummary.this, "Reserved Successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(ReservationSummary.this, Dashboard.class);//create
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
