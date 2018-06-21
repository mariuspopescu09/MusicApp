package com.example.android.musicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {
    ListView list;

    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        list = findViewById(R.id.list);
        final ListView finalList = list;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Songs.this, Player.class);
                intent.putExtra("Song", finalList.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        // Create an ArrayList of songs
        ArrayList<Artist> androidArtist = new ArrayList<>();
        androidArtist.add(new Artist("Where is the love?", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("I Gotta Feeling", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Meet me Halfway", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("My Humps", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Pump it", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("The Time", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Shut Up", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Imma Be", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Don't Lie", "The Black Eyed Peas", R.drawable.bep));
        androidArtist.add(new Artist("Boom Boom Wow", "The Black Eyed Peas", R.drawable.bep));

        // Create an {@link AndroidArtistAdapter}, whose data source is a list of
        // {@link AndroidArtist}s. The adapter knows how to create list item views for each item
        // in the list.
        ArtistAdapter artistadapter = new ArtistAdapter(this, androidArtist);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(artistadapter);

    }
}
