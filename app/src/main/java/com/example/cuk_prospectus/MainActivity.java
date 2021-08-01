package com.example.cuk_prospectus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {
    Button switchActivity,switchActivity_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchActivity = findViewById(R.id.button);
        switchActivity.setOnClickListener(view -> switchActivity());

        switchActivity_01 = findViewById(R.id.button3);
        switchActivity_01.setOnClickListener(view -> switchActivity_0());

        switchActivity_01 = findViewById(R.id.button4);
        switchActivity_01.setOnClickListener(view -> switchActivity_1());
    }
    private void switchActivity() {
        Intent switchActivityIntent = new Intent(this, Activity_2.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivity_0() {
        Intent switchActivityIntent = new Intent(this, Activity_3.class);
        startActivity(switchActivityIntent);
    }
    private void switchActivity_1() {
        Intent switchActivityIntent = new Intent(this, Activity_4.class);
        startActivity(switchActivityIntent);
    }
    }