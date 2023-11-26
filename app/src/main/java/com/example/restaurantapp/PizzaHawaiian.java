package com.example.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaHawaiian extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzahawaiian);

        ImageButton toFood = findViewById(R.id.imageButton31);
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaHawaiian.this, Food.class);
                startActivity(intent);
            }
        });

        ImageButton toNext = findViewById(R.id.imageButton32);
        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaHawaiian.this, PizzaMeat.class);
                startActivity(intent);
            }
        });

        ImageButton toBack = findViewById(R.id.imageButton33);
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaHawaiian.this, PizzaSeafood.class);
                startActivity(intent);
            }
        });




    }
}
