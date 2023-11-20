package com.example.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
//import android.widget.CompoundButton;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class TableCustomization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablecustomization);

        Spinner spinner = findViewById(R.id.dropdownmenu);

        // Define an array or list of items to display in the spinner
        String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        // Set a listener to perform actions when an item is selected
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Retrieve the selected item
                String selectedItem = parent.getItemAtPosition(position).toString();

                // Perform actions based on the selected item
                Toast.makeText(TableCustomization.this, "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle no selection if needed
            }
        });

        ToggleButton toggleButton1 = findViewById(R.id.toggleButton1);
        ToggleButton toggleButton2 = findViewById(R.id.toggleButton2);
        ToggleButton toggleButton3 = findViewById(R.id.toggleButton3);

        // Set background images for each toggle button
        toggleButton1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton1.setBackgroundResource(R.drawable.breakfast_checked);
            } else {
                toggleButton1.setBackgroundResource(R.drawable.breakfast__1_);
            }
        });

        toggleButton2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton2.setBackgroundResource(R.drawable.lunch_checked);
            } else {
                toggleButton2.setBackgroundResource(R.drawable.lunch);
            }
        });

        toggleButton3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton3.setBackgroundResource(R.drawable.dinner_checked);
            } else {
                toggleButton3.setBackgroundResource(R.drawable.dinner);
            }
        });

        Button toSeatingArea = findViewById(R.id.button6);
        toSeatingArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the button is clicked
                // Navigate to SeatingArea activity
                Intent intent = new Intent(TableCustomization.this, SeatingArea.class);
                startActivity(intent);
            }
        });
    }
}

