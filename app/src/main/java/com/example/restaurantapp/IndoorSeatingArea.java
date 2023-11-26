package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IndoorSeatingArea extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indoorseatingarea);

        ImageButton toSeatingArea = findViewById(R.id.imageButton17);
        toSeatingArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndoorSeatingArea.this, SeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toI1 = findViewById(R.id.imageButtonI1);
        toI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toI3 = findViewById(R.id.imageButtonI3);
        toI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toI4 = findViewById(R.id.imageButtonI4);
        toI4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toR3 = findViewById(R.id.imageButtonR3);
        toR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toR4 = findViewById(R.id.imageButtonR4);
        toR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toR6 = findViewById(R.id.imageButtonR6);
        toR6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndoorSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toI2 = findViewById(R.id.imageButtonI2);
        toI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndoorSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toR1 = findViewById(R.id.imageButtonR1);
        toR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndoorSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toR2 = findViewById(R.id.imageButtonR2);
        toR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndoorSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toR5 = findViewById(R.id.imageButtonR5);
        toR5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IndoorSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
