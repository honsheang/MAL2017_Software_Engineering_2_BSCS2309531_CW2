package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GardenSeatingArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gardenseatingarea);

        ImageButton toSeatingArea = findViewById(R.id.imageButton3);
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
    }
}