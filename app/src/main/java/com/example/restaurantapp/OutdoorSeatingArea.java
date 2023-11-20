package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OutdoorSeatingArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seatingareaoutdoor);

        ImageButton toOutdoor = findViewById(R.id.imageButton11);
        toOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OutdoorSeatingArea.this, SeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toGarden = findViewById(R.id.imageButton12);
        toGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OutdoorSeatingArea.this, GardenSeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toSea = findViewById(R.id.imageButton13);
        toSea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OutdoorSeatingArea.this, SeaSeatingArea.class);
                startActivity(intent);
            }
        });
    }
}