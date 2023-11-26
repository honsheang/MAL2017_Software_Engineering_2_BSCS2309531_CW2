package com.example.restaurantapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);

        final ImageView movingImageView = findViewById(R.id.imageView22);
        ImageButton triggerButton = findViewById(R.id.allGrilled);

        triggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calculate the initial and final Y positions for animation
                int startY = movingImageView.getHeight(); // Starting position from the bottom
                int endY = 0; // Final position at the top

                // Create a translation animation from startY to endY
                Animation slideUpAnimation = new TranslateAnimation(0, 0, startY, endY);
                slideUpAnimation.setDuration(1000); // Duration for the animation in milliseconds
                slideUpAnimation.setFillAfter(true); // Keep the view in its final position after the animation

                // Set an animation listener if needed
                slideUpAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        // Perform actions when animation starts
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // Perform actions when animation ends
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                        // Perform actions when animation repeats
                    }
                });

                // Start the animation
                movingImageView.startAnimation(slideUpAnimation);
            }
        });

        ImageButton toTableReserve = findViewById(R.id.imageButtonpizza);
        toTableReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}
