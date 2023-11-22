package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

        ImageButton toG10 = findViewById(R.id.imageButton16);
        toG10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG3 = findViewById(R.id.imageButton18);
        toG10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG8 = findViewById(R.id.imageButton19);
        toG8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG4 = findViewById(R.id.imageButton20);
        toG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG5 = findViewById(R.id.imageButton21);
        toG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toG6 = findViewById(R.id.imageButton22);
        toG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GardenSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });
    }
}