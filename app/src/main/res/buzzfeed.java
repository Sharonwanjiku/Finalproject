package com.verees.mymain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class buzzfeed extends AppCompatActivity {
Button back,book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzfeed);
         back=findViewById(R.id.button2);
         book=findViewById(R.id.button);
         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent bb=new Intent(com.verees.mymain.buzzfeed.this,cardview.class);
                 startActivity(bb);
             }
         });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bb=new Intent(com.verees.mymain.buzzfeed.this,cardview.class);
                startActivity(bb);
            }
        });
    }
}
