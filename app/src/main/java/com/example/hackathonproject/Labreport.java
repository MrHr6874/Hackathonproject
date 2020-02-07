package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class Labreport extends AppCompatActivity {
    Button case1,med1,lab1;
    TextView text21,text22,text23,bck;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labreport);

        case1=(Button)findViewById(R.id.case2);
        med1=(Button)findViewById(R.id.medicine);
        lab1=(Button)findViewById(R.id.lab);

        text21=(TextView)findViewById(R.id.text2);
        text22=(TextView)findViewById(R.id.text3);
        text23=(TextView)findViewById(R.id.text5);
        text21.setText("LR01");
        text22.setText("LR02");
        text23.setText("LR03");
        toolbar=(Toolbar)findViewById(R.id.toolbar2);
        toolbar.setTitle("Health history");
        
        bck=(TextView)findViewById(R.id.textView6);
        text21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm = new Intent(Labreport.this, Lab01.class);
                String data=text21.getText().toString();
                intentm.putExtra("Labid1",data);
                startActivity(intentm);
            }

        });
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Labreport.this,Hackathonnav.class);
                startActivity(n);
            }
        });

        text22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm = new Intent(Labreport.this, Lab02.class);
                String data=text22.getText().toString();
                intentm.putExtra("Labid2",data);
                startActivity(intentm);
            }
        });

        text23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm = new Intent(Labreport.this, Lab03.class);
                String data=text23.getText().toString();
                intentm.putExtra("Labid3",data);
                startActivity(intentm);
            }
        });

        case1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm = new Intent(Labreport.this, Healthhistory.class);
                startActivity(intentm);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });

        med1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentm = new Intent(Labreport.this, Medicine.class);
                startActivity(intentm);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }

        });

    }
}
