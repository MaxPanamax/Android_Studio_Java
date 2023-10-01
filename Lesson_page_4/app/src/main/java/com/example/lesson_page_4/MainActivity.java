package com.example.lesson_page_4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
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
        linearLayout.setBackgroundColor(Color.YELLOW);

        EditText editText=new EditText(this);
        editText.setHint("Введите текст");
        editText.setBackgroundColor(Color.GREEN);
        editText.setHintTextColor(Color.LTGRAY);
        editText.setTextColor(Color.MAGENTA);

        Button button=new Button(this);
        button.setText("Нажми меня");
        button.setBackgroundColor(Color.BLUE);
        button.setTextColor(Color.WHITE);

        button.setLayoutParams(layoutParams);
        TextView textView=new TextView(this);
        textView.setText(editText.getText());
        textView.setBackgroundColor(Color.TRANSPARENT);
        textView.setTextColor(Color.RED);

        linearLayout.addView(editText);
        linearLayout.addView(button);
        linearLayout.addView(textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });

        setContentView(linearLayout);

    }
}