package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Player extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        //Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
