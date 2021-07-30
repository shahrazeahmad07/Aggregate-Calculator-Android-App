package com.uet.medicalaggregatecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    public void calculate(View view) {
        EditText m1 = findViewById(R.id.matricMarks);
        String marks1 = m1.getText().toString();
        int matricMarks = Integer.parseInt(marks1);
        EditText m2 = findViewById(R.id.fscMarks);
        String marks2 = m2.getText().toString();
        int fscMarks = Integer.parseInt(marks2);
        EditText m3 = findViewById(R.id.entryTestMarks);
        String marks3 = m3.getText().toString();
        int entryMarks = Integer.parseInt(marks3);

        double p1 = ((matricMarks/1100d)*100)*0.1d;

        double p2 = ((fscMarks/1100d)*100)*0.4d;

        double p3 = ((entryMarks/200d)*100)*0.5d;

        double aggregate = p1 + p2 + p3;
        String output = String.valueOf(aggregate);

        Toast.makeText(this, output, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
}