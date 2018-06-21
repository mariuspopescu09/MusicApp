package com.example.android.musicapp;

public class Artist {

    //** The artist who plays the song */
    private String mArtist;

    //** Name of the song */
    private String mSong;
    //** Name of the image */
    private int mImage;

    /**
     * Create a new Artist object.
     */
    Artist(String Artist, String Song, int Image) {
        mArtist = Artist;
        mSong = Song;
        mImage = Image;
    }

    /**
     * Get the artist name
     */
    public String getmArtist() {
        return mArtist;
    }

    /**
     * Get the song name
     */
    public String getmSong() {
        return mSong;
    }

    /**
     * *Get the image
     */
    public int getmImage() {
        return mImage;
    }
}
