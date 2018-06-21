package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create an ArrayList of albums
        ArrayList<Artist> androidArtist = new ArrayList<>();
        androidArtist.add(new Artist("The Beginning", "The Black Eyed Peas", R.drawable.ben));
        androidArtist.add(new Artist("The E.N.D.", "The Black Eyed Peas", R.drawable.end));
        androidArtist.add(new Artist("Elephunk", "The Black Eyed Peas", R.drawable.elephunk));


        ArtistAdapter artistadapter = new ArtistAdapter(this, androidArtist);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(artistadapter);
    }
}
