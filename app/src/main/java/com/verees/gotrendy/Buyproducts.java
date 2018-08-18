package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.Adapter2;
import com.Custom;
import com.Custom2;
import com.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class Buyproducts extends AppCompatActivity {
    ListView listView;
    List<Custom2> listhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyproducts);
        listhere=new ArrayList<>();

        listhere.add(new Custom2(R.drawable.afrotwist,"Afrotwist","800/"));
        listhere.add(new Custom2(R.drawable.popsugar,"Popsugar","1800/="));
        listhere.add(new Custom2(R.drawable.insitu,"Insitu","2500/="));
        listhere.add(new Custom2(R.drawable.refrinery,"Refrinery","1500/="));
        listhere.add(new Custom2(R.drawable.stylecraze,"Stylrcraze","1800/="));
        listhere.add(new Custom2(R.drawable.sunshadeweave,"Sunshade","400/="));
        listhere.add(new Custom2(R.drawable.obsessory,"Obsessory","500/="));
        listhere.add(new Custom2(R.drawable.messy,"Messy","900/="));
        listhere.add(new Custom2(R.drawable.frizhairspray,"Frizhairspray","850/="));
        listhere.add(new Custom2(R.drawable.olay,"Olay","1200/="));
        listhere.add(new Custom2(R.drawable.tnighteyeliner,"Tnighteyeliner","7000/="));



        listView=findViewById(R.id.products);
        Adapter2 adapter=new Adapter2(this,R.layout.activity_buy,listhere);
        listView.setAdapter(adapter);
    }

}

