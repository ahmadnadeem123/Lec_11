package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Adapter extends AppCompatActivity {

    Button b1;
    ListView v1;
    EditText e1;
    ArrayList<String> obj;
    obj=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);



        b1=findViewById(R.id.button3);
        v1=findViewById(R.id.list);
        e1=findViewById(R.id.edit);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name= e1.getText().toString();
                obj.add(name);

                ArrayAdapter<String> adp=new ArrayAdapter<String>(Adapter.this, android.R.layout.simple_list_item_1, obj);
                v1.setAdapter(adp);

                adp.notifyDataSetChanged();



            }
        });

        v1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        //        Intent obj2=new Intent(getApplicationContext(), MainActivity.class);
       //         startActivity(obj2);

                 customizelayout obj=new customizelayout(this, obj);






            }
        });


    }
}