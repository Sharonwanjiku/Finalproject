package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.Custom;
import com.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class listview extends AppCompatActivity {
  ListView listView;
  List<Custom> listhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listhere=new ArrayList<>();

        listhere.add(new Custom(R.drawable.african,"African","Always suitable for any occassion","0713894413","2000/="));
        listhere.add(new Custom(R.drawable.american,"American","Its easier to do this hair and you dont have tosit down for long for your hair to be done","0745272754 ","1800/="));
        listhere.add(new Custom(R.drawable.americanstyle,"Americanstyle","Always suitable for any occassion","0710789316","2500/="));
        listhere.add(new Custom(R.drawable.andrea,"Andrea","Having a long hair has a way of making you feel like a princess","0713894413","1500/="));
        listhere.add(new Custom(R.drawable.ebony,"Ebony","THis is one of the most elegant styles you can try all the time","0740897645","1800/="));
        listhere.add(new Custom(R.drawable.insight,"Insight","Always suitable for any occassion","0704851207","3000/="));
        listhere.add(new Custom(R.drawable.latina,"Latina","Always suitable for any occassion","0745241234","1700/="));
        listhere.add(new Custom(R.drawable.messy,"Messy","Always suitable for any occassion","0754321202","2500/="));
        listhere.add(new Custom(R.drawable.naija,"Naija","Always suitable for any occassion","0712354577","850/="));
        listhere.add(new Custom(R.drawable.pinterest,"Pinterest","Always suitable for any occassion","0712345678","1200/="));
        listhere.add(new Custom(R.drawable.stayglam,"Stayglam","Always suitable for any occassion","0705663415","2200/="));



        listView=findViewById(R.id.as);
        MyAdapter adapter=new MyAdapter(this,R.layout.listview_items,listhere);
        listView.setAdapter(adapter);
    }
}

