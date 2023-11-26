package com.example.restaurantapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    private boolean isImageViewVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);

        ImageButton back = findViewById(R.id.imageButton26);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Dashboard.class);
                startActivity(intent);
            }
        });

        ImageButton toPizza = findViewById(R.id.imageButtonpizza);
        toPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Pizza.class);
                startActivity(intent);
            }
        });

        ImageButton allPizza = findViewById(R.id.allPizza);
        allPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Pizza.class);
                startActivity(intent);
            }
        });

        final ImageView allGrilled = findViewById(R.id.imageView22);
        ImageButton grillchicken = findViewById(R.id.allGrilled);
        grillchicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allGrilled.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allGrilled.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allCrispy = findViewById(R.id.imageView21);
        ImageButton crispychicken = findViewById(R.id.allCrispy);
        crispychicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allCrispy.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allCrispy.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allAyam = findViewById(R.id.imageView23);
        ImageButton ayamkau = findViewById(R.id.allAyam);
        ayamkau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allAyam.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allAyam.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allHawaiian = findViewById(R.id.imageView24);
        ImageButton spicyBurger = findViewById(R.id.allHawaiian);
        spicyBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allHawaiian.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allHawaiian.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allChocolate = findViewById(R.id.imageView25);
        ImageButton chocolateBlend = findViewById(R.id.allChocolate);
        chocolateBlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allChocolate.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allChocolate.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allBig = findViewById(R.id.imageView26);
        ImageButton bigBreakfast = findViewById(R.id.allBig);
        bigBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allBig.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allBig.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allTea = findViewById(R.id.imageView27);
        ImageButton breakfastTea = findViewById(R.id.allFirepot);
        breakfastTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allTea.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allTea.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allAglio = findViewById(R.id.imageView28);
        ImageButton aglioOlio = findViewById(R.id.allAglio);
        aglioOlio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allAglio.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allAglio.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allOatmeal = findViewById(R.id.imageView29);
        ImageButton oatmeal = findViewById(R.id.allBerry);
        oatmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allOatmeal.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allOatmeal.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allPancake = findViewById(R.id.imageView30);
        ImageButton pancake = findViewById(R.id.allPancake);
        pancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allPancake.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allPancake.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allMoscow = findViewById(R.id.imageView31);
        ImageButton moscowMule = findViewById(R.id.allMoscow);
        moscowMule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allMoscow.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allMoscow.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allChefAyam = findViewById(R.id.imageView23);
        ImageButton chefAyam = findViewById(R.id.imageButtonayam);
        chefAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allChefAyam.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allChefAyam.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allChefGrilled = findViewById(R.id.imageView22);
        ImageButton chefGrilled = findViewById(R.id.imageButtongrilled);
        chefGrilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allChefGrilled.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allChefGrilled.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });

        final ImageView allChefMoscow = findViewById(R.id.imageView31);
        ImageButton chefMoscow = findViewById(R.id.imageButtonmoscow);
        chefMoscow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isImageViewVisible) {
                    allChefMoscow.setVisibility(View.VISIBLE);
                    isImageViewVisible = true;
                } else {
                    allChefMoscow.setVisibility(View.INVISIBLE);
                    isImageViewVisible = false;
                }
            }
        });






    }
}
