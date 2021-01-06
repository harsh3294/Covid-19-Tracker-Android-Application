package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Main_Splash_Screen extends AppCompatActivity {
    private static int Splash_Timeout=2500;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__splash__screen);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                intent =new Intent(Main_Splash_Screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },Splash_Timeout);
    }
}