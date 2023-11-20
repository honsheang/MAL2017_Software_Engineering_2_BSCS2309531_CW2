package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SeatingArea extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seatingarea);

        ImageButton toOutdoor = findViewById(R.id.imageButton9);
        toOutdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the image button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(SeatingArea.this, IndoorSeatingArea.class);
                startActivity(intent);
            }
        });

        ImageButton toGarden = findViewById(R.id.imageButton10);
        toGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the image button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(SeatingArea.this, OutdoorSeatingArea.class);
                startActivity(intent);
            }
        });
    }
}
