package com.eason.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    String temp_str = "";
    String method = "";
    int number1 = -1, number2 = -1;

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        TextView tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        if (getIntent()!=null){
            tvTitle.setText(getIntent().getStringExtra("title"));
        }
    }

    public void calcClick(View view) {
        Button button = (Button) view;
        String btn_text = button.getText().toString();

        if (btn_text.equals("AC") || btn_text.equals("C")){
            tvResult.setText("0");
            initNumber();
        }else if (btn_text.equals("=")){
            if (method.equals("÷")){
                temp_str = String.valueOf((number1 / number2));
            }else if (method.equals("×")){
                temp_str = String.valueOf((number1 * number2));
            }else if (method.equals("－")){
                temp_str = String.valueOf((number1 - number2));
            }else if (method.equals("+")){
                temp_str = String.valueOf((number1 + number2));
            }
            tvResult.setText(temp_str);
            initNumber();
        }else if (btn_text.equals("÷") || btn_text.equals("×") || btn_text.equals("－") || btn_text.equals("+")){
            if (!tvResult.getText().toString().equals("0")){
                method = btn_text;
                number1 = Integer.parseInt(tvResult.getText().toString());
                temp_str = "";
            }
        }else{
            try {
                temp_str+=btn_text;
                if (method.equals("")){
                    number1 = Integer.parseInt(temp_str);
                }else{
                    number2 = Integer.parseInt(temp_str);
                }
                tvResult.setText(temp_str);
            }catch (NumberFormatException e){
                Toast.makeText(CalcActivity.this, "not support: "+ btn_text, Toast.LENGTH_SHORT).show();
                tvResult.setText("0");
                initNumber();
            }
        }
    }

    private void initNumber(){
        temp_str = "";
        method = "";
        number1 = -1;
        number2 = -1;
    }
}