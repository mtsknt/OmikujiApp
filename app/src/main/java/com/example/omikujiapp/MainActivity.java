package com.example.omikujiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.omikujiText);
    }

    String[] fortune = {"bad", "not good", "not bad", "good", "excellent!!"};

    public void changeTextView(View view) {
        int n = ThreadLocalRandom.current().nextInt(0, 5);
        if (n == 4){
            text.setTextColor(Color.RED);
        } else {
            text.setTextColor(Color.parseColor("#999999"));
        }
        text.setText(fortune[n]);
    }
}