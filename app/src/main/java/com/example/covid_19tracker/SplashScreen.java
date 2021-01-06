package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends AppCompatActivity {
    private static int Splash_Timeout=2500;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                intent =new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },Splash_Timeout);
    }
}
