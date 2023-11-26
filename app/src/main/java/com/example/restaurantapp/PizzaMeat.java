package com.example.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaMeat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzameat);

        ImageButton toFood = findViewById(R.id.imageButton34);
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMeat.this, Food.class);
                startActivity(intent);
            }
        });

        ImageButton toNext = findViewById(R.id.imageButton35);
        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMeat.this, Pizza.class);
                startActivity(intent);
            }
        });

        ImageButton toBack = findViewById(R.id.imageButton36);
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaMeat.this, PizzaHawaiian.class);
                startActivity(intent);
            }
        });




    }
}
