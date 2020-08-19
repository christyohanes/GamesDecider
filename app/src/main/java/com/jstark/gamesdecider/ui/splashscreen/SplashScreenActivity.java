package com.jstark.gamesdecider.ui.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.jstark.gamesdecider.R;
import com.jstark.gamesdecider.ui.homepage.HomeActivity;

import java.util.Objects;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler(Objects.requireNonNull(Looper.myLooper())).postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(SplashScreenActivity.this,HomeActivity.class);
                startActivity(i);
            }
        }, 4000);
    }
}