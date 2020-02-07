package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hackathonproject.ui.opdrem.OpdremFragment;

public class Opdrem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opdrem_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, OpdremFragment.newInstance())
                    .commitNow();
        }
    }
}
