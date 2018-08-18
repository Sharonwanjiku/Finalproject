package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    finish();
                    Intent dd = new Intent(splash.this, Login.class);
                    startActivity(dd);

                } catch (Exception e) {

                }
            }
        };
        background.start();
    }
}
