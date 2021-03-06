package com.uet.medicalaggregatecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this, HomeScreen.class);
            startActivity(i);
            finish();
        }, 3000);
    }
}