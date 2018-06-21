
package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

// Find the View that shows the songs category
        ImageView songs = findViewById(R.id.songs);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });
        // Find the View that shows the player category
        ImageView player = findViewById(R.id.player);

// Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, Player.class);
                startActivity(playerIntent);
            }
        });

        // Find the View that shows the player category
        ImageView search = findViewById(R.id.search);
        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Find the View that shows the album category
        ImageView album = findViewById(R.id.album);
        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, Album.class);
                startActivity(albumIntent);
            }
        });
    }
}
