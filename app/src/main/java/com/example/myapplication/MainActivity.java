package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

     Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        String [] Colors = {"Red", "Green", "Blue"};




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("SetColor")
                .setItems(Colors, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, Colors[which], Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();




            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Alert Box");
                builder.setTitle("Dialog");
                builder.setCancelable(false);


                builder.setPositiveButton(
                        "Positive Button",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int asdf)
                            {
                                dialog.dismiss();
                            }
                        });
                builder.setNegativeButton(
                        "Negative Button",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();






            }
        });




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
