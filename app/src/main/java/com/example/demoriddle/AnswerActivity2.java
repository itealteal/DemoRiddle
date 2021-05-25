package com.example.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvA2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvA2 = findViewById(R.id.tvA2);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tvA2.setText(questionSelected + " answer is: Gone");
    }
}