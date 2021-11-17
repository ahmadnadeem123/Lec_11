package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Toast tost= Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG);
        //tost.show();


        LayoutInflater layoutInflater = getLayoutInflater();

        View myLayout=layoutInflater.inflate(R.layout.layout2,null);



        Toast myToast=new Toast(getApplicationContext());

        myToast.setDuration(Toast.LENGTH_LONG);

        myToast.setView(myLayout);

        myToast.show();
    }
}