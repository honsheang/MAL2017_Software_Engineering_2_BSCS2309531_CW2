package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        ImageButton toTableReserve = findViewById(R.id.imageButton6);
        toTableReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, TableCustomization.class);
                startActivity(intent);
            }
        });

        ImageButton toFood = findViewById(R.id.imageButton5);
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food.class);
                startActivity(intent);
            }
        });

        ImageButton toProfile = findViewById(R.id.imageButtonprofile);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);
                startActivity(intent);
            }
        });

        ImageButton toSearch = findViewById(R.id.imageButtonSearch);
        toSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Search.class);
                startActivity(intent);
            }
        });

        ImageButton toBreakfast = findViewById(R.id.imageButtonbreakfast);
        toBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toLunch = findViewById(R.id.imageButtonlunch);
        toLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toDinner = findViewById(R.id.imageButtondinner);
        toDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toBreakfastDeal = findViewById(R.id.imageButtonbreakfastspecial);
        toBreakfastDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toComboDeal = findViewById(R.id.imageButtonCombospecial);
        toComboDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toFamilyDeal = findViewById(R.id.imageButtonfamilyspecial);
        toFamilyDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });

        ImageButton toSFamilyDeal = findViewById(R.id.imageButtonSuperfamilyspecial);
        toSFamilyDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Profile.class);//create
                startActivity(intent);
            }
        });
    }
}
