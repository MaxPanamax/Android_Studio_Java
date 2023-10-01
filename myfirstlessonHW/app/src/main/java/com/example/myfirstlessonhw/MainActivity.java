package com.example.myfirstlessonhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editTextText4);
        number2 = findViewById(R.id.editTextText6);
    }
    public void onClickCalc(View view) {
        Button button = (Button) view;
        String sign = button.getText().toString();
        Calc calc = new Calc(Integer.parseInt(number1.getText().toString()), Integer.parseInt(number2.getText().toString()), sign);
        Toast.makeText(this, "Результат: " + calc.getResult(), Toast.LENGTH_SHORT).show();

    }
}