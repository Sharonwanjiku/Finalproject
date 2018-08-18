package com.verees.gotrendy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Facebook extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        web=findViewById(R.id.wb);
        web.loadUrl(" https://www.facebook.com/Sharon Wanjiku?ref=bookmarks");
        web.getSettings().setJavaScriptEnabled(true);

    }
}
