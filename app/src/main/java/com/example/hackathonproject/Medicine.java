package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class Medicine extends AppCompatActivity {
    Button case1,med1,lab1;
    TextView text1,text2,text3,bck;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        case1=(Button)findViewById(R.id.case2);
        med1=(Button)findViewById(R.id.medicine);
        lab1=(Button)findViewById(R.id.lab);
        text1=(TextView)findViewById(R.id.text);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);
        toolbar=(Toolbar)findViewById(R.id.toolbar2);
        toolbar.setTitle("Health history");
        bck=(TextView)findViewById(R.id.textView6);

        text1.setText("MED01");
        text2.setText("MED02");
        text3.setText("MED03");
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Medicine.this,Hackathonnav.class);
                startActivity(n);
            }
        });

        case1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Medicine.this,Healthhistory.class);
                startActivity(n);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });

        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Medicine.this,Labreport.class);
                startActivity(n);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });
    }
}
