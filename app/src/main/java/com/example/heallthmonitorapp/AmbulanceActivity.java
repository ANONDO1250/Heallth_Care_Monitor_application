package com.example.heallthmonitorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AmbulanceActivity extends AppCompatActivity {

    private LinearLayout ambulance1Layout;
    private LinearLayout ambulance2Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        ambulance1Layout = findViewById(R.id.ambulance1Layout);
        ambulance2Layout = findViewById(R.id.ambulance2Layout);

        ambulance1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Ambulance 1
                openAmbulanceDetails("Ambulance 1", "123456789");
            }
        });

        ambulance2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Ambulance 2
                openAmbulanceDetails("Ambulance 2", "987654321");
            }
        });
    }

    private void openAmbulanceDetails(String ambulanceName, String contactNumber) {
        // Pass the ambulance details to the next activity
        Intent intent = new Intent(this, HomePageActivity.class);
        intent.putExtra("ambulanceName", ambulanceName);
        intent.putExtra("contactNumber", contactNumber);
        startActivity(intent);
    }
}
