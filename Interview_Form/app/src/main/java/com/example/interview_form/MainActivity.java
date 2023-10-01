package com.example.interview_form;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        layoutParams.setMargins(160,16,160,16);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.WHITE);

        layoutParams.setMargins(160,16,160,16);
        LinearLayout linearLayout2=new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout2.setBackgroundColor(Color.WHITE);

        layoutParams.setMargins(160,16,160,16);
        LinearLayout linearLayout3=new LinearLayout(this);
        linearLayout3.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout3.setBackgroundColor(Color.WHITE);

        RadioButton radioButton=new RadioButton(this);
        TextView textViewB1=new TextView(this);
        textViewB1.setHint("6");
        RadioButton radioButton2=new RadioButton(this);
        TextView textViewB2=new TextView(this);
        textViewB2.setHint("7");
        RadioButton radioButton3=new RadioButton(this);
        TextView textViewB3=new TextView(this);
        textViewB3.setHint("8");
        RadioButton radioButton4=new RadioButton(this);
        TextView textViewB4=new TextView(this);
        textViewB4.setHint("9");

        RadioButton radioButton11=new RadioButton(this);
        TextView textViewB11=new TextView(this);
        textViewB11.setHint("6");
        RadioButton radioButton22=new RadioButton(this);
        TextView textViewB22=new TextView(this);
        textViewB22.setHint("7");
        RadioButton radioButton33=new RadioButton(this);
        TextView textViewB33=new TextView(this);
        textViewB33.setHint("8");
        RadioButton radioButton44=new RadioButton(this);
        TextView textViewB44=new TextView(this);
        textViewB44.setHint("9");

        EditText editText=new EditText(this);
        editText.setHint("app name");
        editText.setBackgroundColor(Color.WHITE);
        editText.setHintTextColor(Color.LTGRAY);
        editText.setTextColor(Color.MAGENTA);

        EditText editTextFIO=new EditText(this);
        editTextFIO.setHint("FIO");
        editTextFIO.setBackgroundColor(Color.WHITE);
        editTextFIO.setHintTextColor(Color.LTGRAY);
        editTextFIO.setTextColor(Color.MAGENTA);

        EditText editTextSL=new EditText(this);
        editTextSL.setHint("Salary Level");
        editTextSL.setBackgroundColor(Color.WHITE);
        editTextSL.setHintTextColor(Color.LTGRAY);
        editTextSL.setTextColor(Color.MAGENTA);

        linearLayout2.addView(radioButton);
        linearLayout2.addView(textViewB1);
        linearLayout2.addView(radioButton2);
        linearLayout2.addView(textViewB2);
        linearLayout2.addView(radioButton3);
        linearLayout2.addView(textViewB3);
        linearLayout2.addView(radioButton4);
        linearLayout2.addView(textViewB4);

        linearLayout3.addView(radioButton11);
        linearLayout3.addView(textViewB11);
        linearLayout3.addView(radioButton22);
        linearLayout3.addView(textViewB22);
        linearLayout3.addView(radioButton33);
        linearLayout3.addView(textViewB33);
        linearLayout3.addView(radioButton44);
        linearLayout3.addView(textViewB44);

        linearLayout.addView(editText);
        linearLayout.addView(editTextFIO);
        linearLayout.addView(editTextSL);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);


        setContentView(linearLayout);


    }



}