package com.example.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvA1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvA1 = findViewById(R.id.tvA1);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tvA1.setText(questionSelected + " answer is: Queue");
    }
}