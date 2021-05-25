package com.example.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    Button buttonR1;
    TextView tvQ2;
    Button buttonR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.tvQ1);
        buttonR1 = findViewById(R.id.buttonR1);
        tvQ2 = findViewById(R.id.tvQ2);
        buttonR2 = findViewById(R.id.buttonR2);

        buttonR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);

            }
        });

        buttonR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question","Q2");
                startActivity(intent);
            }
        });
    }
}