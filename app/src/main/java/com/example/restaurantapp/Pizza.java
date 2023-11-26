package com.example.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Pizza extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza);

        ImageButton toFood = findViewById(R.id.imageButton25);
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza.this, Food.class);
                startActivity(intent);
            }
        });
        ImageButton toNext = findViewById(R.id.imageButton3);
        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza.this, PizzaSeafood.class);
                startActivity(intent);
            }
        });

        ImageButton toBack = findViewById(R.id.imageButton24);
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pizza.this, PizzaMeat.class);
                startActivity(intent);
            }
        });





    }
}
