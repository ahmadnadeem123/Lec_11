package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.myapplication.R;

import java.util.ArrayList;

public class customizelayout extends ArrayAdapter
{

    private final Activity context;
    private final ArrayList<String> maintitle;


    public customizelayout(Activity context, ArrayList<String> x)
    {
        super(context, R.layout.customize,x);
        this.context=context;
        this.maintitle=x;




    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(R.layout.customize, null,true);

//        titleHeading.setText(maintitle[position]);
//        imageView.setImageResource(imgid[position]);
//        titleDetails.setText(subtitle[position]);

        return singleEntityView;
    };


}
