package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {
Button back,ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        back = findViewById(R.id.b3);
        ma=findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j5 = new Intent(AboutUs.this, Cardview.class);
                startActivity(j5);
                finish();
            }

        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j6 = new Intent(AboutUs.this, Facebook.class);
                startActivity(j6);
                finish();
            }

        });
    }
}
