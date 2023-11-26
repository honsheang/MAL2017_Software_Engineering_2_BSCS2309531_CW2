package com.example.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaSeafood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzaseafood);

        ImageButton toFood = findViewById(R.id.imageButton26);
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaSeafood.this, Food.class);
                startActivity(intent);
            }
        });

        ImageButton toNext = findViewById(R.id.imageButton27);
        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaSeafood.this, PizzaHawaiian.class);
                startActivity(intent);
            }
        });

        ImageButton toBack = findViewById(R.id.imageButton28);
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaSeafood.this, Pizza.class);
                startActivity(intent);
            }
        });




    }
}
