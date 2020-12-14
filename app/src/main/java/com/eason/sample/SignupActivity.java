package com.eason.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText etAccount, etPassword, etPasswordAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etAccount = findViewById(R.id.etAccount);
        etPassword = findViewById(R.id.etPassword);
        etPasswordAgain = findViewById(R.id.etPasswordAgain);

    }

    public void submitClick(View view) {

        if (etAccount.getText().toString().isEmpty()){
            Toast.makeText(SignupActivity.this, "請輸入帳號", Toast.LENGTH_SHORT).show();
            return;
        }

        if (etPassword.getText().toString().isEmpty() || etPasswordAgain.getText().toString().isEmpty()){
            Toast.makeText(SignupActivity.this, "請輸入密碼", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!etPassword.getText().toString().equals(etPasswordAgain.getText().toString())){
            Toast.makeText(SignupActivity.this, "兩次密碼不一致！", Toast.LENGTH_SHORT).show();
            return;
        }

        setResult(Activity.RESULT_OK);
        finish();

    }
}