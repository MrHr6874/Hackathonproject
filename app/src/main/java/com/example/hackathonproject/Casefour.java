package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Casefour extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casefour);
        t=(TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("caseidvalue4");
        t.setText(str);
    }
}
