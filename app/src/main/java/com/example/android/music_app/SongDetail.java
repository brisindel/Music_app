package com.example.android.music_app;

public class SongDetail {
    // Drawable resource ID
    private int mImageSongId;

    // Music category
    private String mSongTitle;

    // Music category
    private String mSongAlbum;

    // Music category
    private String mSongAuthor;

    // Music category
    private String mSongLength;

    /*
    * Create a new MusicCategoryDetail object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with MusicCategoryDetail
    * @param mMusicCategory is list of MusicCategoryDetail
    * */
    public SongDetail(int ImageSongId, String SongTitle, String SongAlbum, String SongAuthor, String SongLength) {
        mImageSongId = ImageSongId;
        mSongTitle = SongTitle;
        mSongAlbum = SongAlbum;
        mSongAuthor = SongAuthor;
        mSongLength = SongLength;
    }

    /**
     * Get the image resource ID
     */
    public int getImageSongId() {
        return mImageSongId;
    }

    /**
     * Get the Android version number
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the Android version number
     */
    public String getSongAlbum() {
        return mSongAlbum;
    }

    /**
     * Get the Android version number
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }

    /**
     * Get the Android version number
     */
    public String getSongLength() {
        return mSongLength;
    }
}
