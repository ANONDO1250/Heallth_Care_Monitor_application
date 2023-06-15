package com.example.heallthmonitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    private ImageView appointmentImageView;
    private ImageView testImageView;
    private ImageView emergencyImageView;
    private ImageView hospitalImageView;
    private TextView healthInformationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_all);

        // Find ImageView and TextView elements by their IDs
        appointmentImageView = findViewById(R.id.appointmentImageView);
        testImageView = findViewById(R.id.testImageView);
        emergencyImageView = findViewById(R.id.emergencyImageView);
        hospitalImageView = findViewById(R.id.hospitalImageView);
        healthInformationTextView = findViewById(R.id.healthInformationTextView);

        // Set click listeners for each ImageView
        appointmentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppointmentPage();
            }
        });

        testImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTestPage();
            }
        });

        emergencyImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmbulancePage();
            }
        });

        hospitalImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHospitalPage();
            }
        });

        // Set click listener for the health information section
        healthInformationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHealthInformationPage();
            }
        });
    }

    // Method to open the appointment page
    public void openAppointmentPage() {
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivity(intent);
    }

    // Method to open the test page
    public void openTestPage() {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }

    // Method to call an ambulance
    public void openAmbulancePage() {
        Intent intent = new Intent(this, AmbulanceActivity.class);
        startActivity(intent);
    }

    // Method to open the hospital page
    public void openHospitalPage() {
        Intent intent = new Intent(this, HospitalActivity.class);
        startActivity(intent);
    }

    // Method to open the health information page
    public void openHealthInformationPage() {
        Intent intent = new Intent(this, HealthInformationActivity.class);
        startActivity(intent);
    }
}
