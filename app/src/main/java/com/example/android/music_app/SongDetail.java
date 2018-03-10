package com.example.android.music_app;

/**
 * Created by uLeho on 06.03.2018.
 */

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
    * Create a new MusicCategory object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with MusicCategory
    * @param mMusicCategory is list of MusicCategory
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
