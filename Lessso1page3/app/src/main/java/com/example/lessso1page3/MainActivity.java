package com.example.lessso1page3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView number1EditText;
private TextView number2EditText;
private TextView resultEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1EditText=findViewById(R.id.number1View);

//        resultEditText=findViewById(R.id.resultView);

    }
    public void addNumber(View view){
        double number1=Double.parseDouble(number1EditText.getText().toString());
        double number2=Double.parseDouble(number1EditText.getText().toString());
        double result=number1+number2;
    }
}