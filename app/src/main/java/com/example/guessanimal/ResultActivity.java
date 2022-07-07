package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    String result;
    TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultTv = findViewById(R.id.resultTv);
        result = getIntent().getStringExtra("key");
        resultTv.setText(result);
    }
}