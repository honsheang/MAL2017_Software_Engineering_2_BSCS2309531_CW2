package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GardenSeatingArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gardenseatingarea);

        ImageButton toSeatingArea = findViewById(R.id.imageButtonfamilyspecial);
        toSeatingArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, SeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toOutdoor = findViewById(R.id.imageButton8);
        toOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, OutdoorSeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toG10 = findViewById(R.id.imageButtonG10);
        toG10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG3 = findViewById(R.id.imageButtonG3);
        toG10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG8 = findViewById(R.id.imageButtonG8);
        toG8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG4 = findViewById(R.id.imageButtonG4);
        toG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG5 = findViewById(R.id.imageButtonG5);
        toG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG6 = findViewById(R.id.imageButtonG6);
        toG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG1 = findViewById(R.id.imageButtonG1);
        toG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GardenSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });


        ImageButton toG2 = findViewById(R.id.imageButtonG2);
        toG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GardenSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toG7 = findViewById(R.id.imageButtonG7);
        toG7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GardenSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toG9 = findViewById(R.id.imageButtonG9);
        toG9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GardenSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}