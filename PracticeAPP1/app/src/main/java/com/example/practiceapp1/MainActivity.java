package com.example.practiceapp1;

import static com.example.practiceapp1.R.*;
import static com.example.practiceapp1.R.id.email;
import static com.example.practiceapp1.R.id.phone;
import static com.example.practiceapp1.R.id.signupBTN;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;



public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText Email;
    EditText Phone;
    EditText dateofbirth;
    Button signupBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        EditText username = (EditText) findViewById(id.username);
        Button signupbtn = (Button) findViewById(id.signupBTN);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username1 = username.getText().toString();
                Toast.makeText(MainActivity.this, "Here Is You're Inforamtion "+username1, Toast.LENGTH_SHORT).show();

            }
        });



    }
}