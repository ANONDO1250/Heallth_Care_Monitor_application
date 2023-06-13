package com.example.heallthmonitorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button registrationButton = findViewById(R.id.registrationButton);
        registrationButton.setOnClickListener(v -> {
            // Handle registration button click
            openRegistrationPage();
        });
    }

    private void openRegistrationPage() {
        // Open the registration activity
        Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
}
