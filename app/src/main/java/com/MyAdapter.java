package com;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.verees.gotrendy.Cardview;
import com.verees.gotrendy.R;
import com.verees.gotrendy.listview;

import java.util.List;

public class MyAdapter  extends ArrayAdapter<Custom> {

Context mCtx;
int resource;
List<Custom> listhere;
public MyAdapter(Context mCtx, int resource,List<Custom> listhere){
    super(mCtx, resource, listhere);
    this.mCtx=mCtx;
    this.resource=resource;
    this.listhere=listhere;
} Button back;

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.listview_items,null);
        TextView name = view.findViewById(R.id.textView);
        TextView description=view.findViewById(R.id.textView5);
        ImageView d=view.findViewById(R.id.imageView2);
        Button contact = view.findViewById(R.id.button);
        back =view.findViewById(R.id.button4);
     final Custom custom =listhere.get(position);
        name.setText(custom.getName());
        description.setText(custom.getDescription());
        d.setImageDrawable(mCtx.getResources().getDrawable(custom.getImages()));
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",custom.getPhonenumber(),null));
                mCtx.startActivity(call);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getContext(),Cardview.class);
                mCtx.startActivity(back);


            }
        });
//        view.findViewById(R.id.button).setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
////                   makepay(position);
//
//                    }
//                });
        return view;
    }
//private void makepay(final int position){
//    AlertDialog.Builder builder=new AlertDialog.Builder(mCtx);
//    builder.setTitle("Purchase item");
//    builder.setPositiveButton("Confirm Payment", new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialogInterface, int i) {
//            Intent simToolKitLaunchIntent = getContext().getPackageManager().getLaunchIntentForPackage
//                    ("com.android.stk");
//            if (simToolKitLaunchIntent !=null){
//              mCtx.startActivity(simToolKitLaunchIntent);
//            }
//        }
//    });
//    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialogInterface, int i) {
//            Toast.makeText(mCtx, "Oreder cancelled", Toast.LENGTH_SHORT).show();
//        }
//    });
//    AlertDialog alertDialog=builder.create();
//    alertDialog.show();
//}


}

