package com.eason.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        TextView tvTitle = findViewById(R.id.tvTitle);
        if (getIntent()!=null){
            tvTitle.setText(getIntent().getStringExtra("title"));
        }
    }

    public void calcClick(View view) {
        Button button = (Button) view;
        Toast.makeText(CalcActivity.this, button.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}