package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ProgressBar bar, barH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        barH = (ProgressBar) findViewById(R.id.progressBarHorizontal);
        barH.setMax(100);
    }

    public void show(View v) {
        EditText et = (EditText) findViewById(R.id.editText);
        String n = et.getText().toString();
        et.setError(null);
        int number = Integer.parseInt(n);
        if (number >= 0 && number <= 100) {
            barH.setProgress(number);
            if (number < 100) {
                showProgress(true);
            } else {
                showProgress(false);
            }
        } else {
            et.setError("Wrong");
        }
    }

    public void showProgress(boolean enabled) {
        if (enabled) {
            bar.setVisibility(View.VISIBLE);
        } else {
            bar.setVisibility(View.INVISIBLE);
        }
    }

}
