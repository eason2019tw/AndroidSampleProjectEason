package com.eason.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAccount, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAccount = findViewById(R.id.etAccount);
        etPassword = findViewById(R.id.etPassword);

    }

    public void loginClick(View view) {
        if (etAccount.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "請輸入帳號", Toast.LENGTH_SHORT).show();
            return;
        }

        if (etPassword.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "請輸入密碼", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    public void signupClick(View view) {
        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);

    }
}