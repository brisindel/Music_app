package com.example.android.music_app;

/**
 * Created by uLeho on 05.03.2018.
 */

public class MusicCategory {
    // Drawable resource ID
    private int mImageResourceId;

    // Music category
    private String mMusicCategory;

    /*
    * Create a new MusicCategory object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with MusicCategory
    * @param mMusicCategory is list of MusicCategory
    * */
    public MusicCategory(int imageResourceId, String vCategory) {
        mImageResourceId = imageResourceId;
        mMusicCategory = vCategory;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the Android version number
     */
    public String getMusicCategory() {
        return mMusicCategory;
    }
}

