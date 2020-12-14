package com.eason.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvResult = findViewById(R.id.tvResult);
        String name = getIntent().getStringExtra("name");
        tvResult.setText("Hello " + name + "\nWelcome to SecondActivity");
    }

    public void backClick(View view) {
        finish();
    }
}