package com.example.android.music_app;

public class MusicCategoryDetail {
    // Drawable resource ID
    private int mImageResourceId;

    // Music category
    private String mMusicCategory;

    /*
    * Create a new MusicCategoryDetail object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with MusicCategoryDetail
    * @param mMusicCategory is list of MusicCategoryDetail
    * */
    public MusicCategoryDetail(int imageResourceId, String vCategory) {
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

