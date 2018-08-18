package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Cardview extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        btn1 = findViewById(R.id.b1);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);

       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j1 = new Intent(Cardview.this, listview.class);
                startActivity(j1);
                finish();
            }

        });
       btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j2 = new Intent(Cardview.this, Buyproducts.class);
                startActivity(j2);
                finish();
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j3 = new Intent(Cardview.this, MapsActivity.class);
                startActivity(j3);
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j4 = new Intent(Cardview.this, AboutUs.class);
                startActivity(j4);
                finish();
            }

        });
    }
}
