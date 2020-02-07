package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class Healthhistory extends AppCompatActivity {

   Button case1,med1,lab1;
   TextView text1,text2,text3,text4,bck;

   Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthhistory);
       case1=(Button)findViewById(R.id.case2);
        med1=(Button)findViewById(R.id.medicine);
        lab1=(Button)findViewById(R.id.lab);
        text1=(TextView)findViewById(R.id.text);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);
        text4=(TextView)findViewById(R.id.text5);
        bck=(TextView)findViewById(R.id.textView6);
        toolbar=(Toolbar)findViewById(R.id.toolbar2);
        toolbar.setTitle("Health history");
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Healthhistory.this,Hackathonnav.class);
                startActivity(n);
            }
        });
        case1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentc = new Intent ("Healthhistory");


            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Healthhistory.this,Caseone.class);
                String data=text1.getText().toString();
                n.putExtra("caseidvalue1",data);
                startActivity(n);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Healthhistory.this,Casetwo.class);
                String data=text2.getText().toString();
                n.putExtra("caseidvalue2",data);
                startActivity(n);
            }
        });
text3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent n=new Intent(Healthhistory.this,Casethree.class);
        String data=text3.getText().toString();
        n.putExtra("caseidvalue3",data);
        startActivity(n);
    }
});

text4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent n=new Intent(Healthhistory.this,Caseone.class);
        String data=text4.getText().toString();
        n.putExtra("caseidvalue4",data);
        startActivity(n);
    }
});

        med1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentm = new Intent(Healthhistory.this, Medicine.class);
                startActivity(intentm);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

            }
        });

        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentl = new Intent(Healthhistory.this,Labreport.class);
                startActivity(intentl);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });


    }






}
