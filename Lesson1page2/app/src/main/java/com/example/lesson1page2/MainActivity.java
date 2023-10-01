package com.example.lesson1page2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);

    }
    public void shwoToast(View view){
        String text=editText.getText().toString();
        if(!text.isEmpty()){
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }
}