package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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


    }
}