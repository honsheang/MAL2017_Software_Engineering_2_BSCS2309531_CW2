package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SeaSeatingArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seaseatingarea);

        ImageButton toOutdoor = findViewById(R.id.imageButton14);
        toOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the image button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(SeaSeatingArea.this, SeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toGarden = findViewById(R.id.imageButton15);
        toGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the image button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(SeaSeatingArea.this, OutdoorSeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toS3 = findViewById(R.id.imageButtonS3);
        toS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toS5 = findViewById(R.id.imageButtonS5);
        toS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toS8 = findViewById(R.id.imageButtonS8);
        toS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toS9 = findViewById(R.id.imageButtonS9);
        toS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toSL2 = findViewById(R.id.imageButtonSL2);
        toSL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toSL4 = findViewById(R.id.imageButtonSL4);
        toSL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeaSeatingArea.this, ReservationSummary.class);
                startActivity(intent);
            }
        });

        ImageButton toS1 = findViewById(R.id.imageButtonS1);
        toS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toS2 = findViewById(R.id.imageButtonS2);
        toS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toS4 = findViewById(R.id.imageButtonS4);
        toS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toS6 = findViewById(R.id.imageButtonS6);
        toS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toS7 = findViewById(R.id.imageButtonS7);
        toS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toS10 = findViewById(R.id.imageButtonS10);
        toS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toSL1 = findViewById(R.id.imageButtonSL1);
        toSL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton toSL3 = findViewById(R.id.imageButtonSL3);
        toSL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeaSeatingArea.this, "Table is UNAVAILABLE", Toast.LENGTH_SHORT).show();
            }
        });


    }
}