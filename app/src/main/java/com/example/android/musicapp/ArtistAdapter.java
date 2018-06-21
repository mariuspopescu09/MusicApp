package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidArtist} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the version name from the current AndroidArtist object and
        // set this text on the name TextView
        assert currentArtist != null;
        artistTextView.setText(currentArtist.getmArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the version number from the current AndroidArtist object and
        // set this text on the number TextView
        songTextView.setText(currentArtist.getmSong());

//Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView iconView = listItemView.findViewById(R.id.artist_image);
        // Get the image resource ID from the current AndroidArtist object and
        // set the image to iconView
        iconView.setImageResource(currentArtist.getmImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
