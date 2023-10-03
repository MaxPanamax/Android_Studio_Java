package com.example.hw_2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private long onCreateTime, onStartTime, onResumeTime, onPauseTime, onStopTime, onDestroyTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateTime = System.currentTimeMillis();
        Log.d(TAG, "onCreate: Метод onCreate вызван");
    }

    @Override
    protected void onStart() {
        super.onStart();
        onStartTime = System.currentTimeMillis();
        Log.d(TAG, "onStart: Метод onStart вызван");
        long timeDifference = onStartTime - onCreateTime;
        Log.d(TAG, "Разница во времени между onCreate и onStart: " + timeDifference + " мс");
    }

    @Override
    protected void onResume() {
        super.onResume();
        onResumeTime = System.currentTimeMillis();
        Log.d(TAG, "onResume: Метод onResume вызван");
        long timeDifference = onResumeTime - onStartTime;
        Log.d(TAG, "Разница во времени между onStart и onResume: " + timeDifference + " мс");
    }

    @Override
    protected void onPause() {
        super.onPause();
        onPauseTime = System.currentTimeMillis();
        Log.d(TAG, "onPause: Метод onPause вызван");
        long timeDifference = onPauseTime - onResumeTime;
        Log.d(TAG, "Разница во времени между onResume и onPause: " + timeDifference + " мс");
    }

    @Override
    protected void onStop() {
        super.onStop();
        onStopTime = System.currentTimeMillis();
        Log.d(TAG, "onStop: Метод onStop вызван");
        long timeDifference = onStopTime - onPauseTime;
        Log.d(TAG, "Разница во времени между onPause и onStop: " + timeDifference + " мс");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onDestroyTime = System.currentTimeMillis();
        Log.d(TAG, "onDestroy: Метод onDestroy вызван");
        long timeDifference = onDestroyTime - onStopTime;
        Log.d(TAG, "Разница во времени между onStop и onDestroy: " + timeDifference + " мс");
    }
}