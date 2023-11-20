package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

    }
}
