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

    // Music category
    private static Integer mSongFile;

    /*
    * Create a new MusicCategoryDetail object.
    *
    * @param mImageResourceID is drawable reference ID that corresponds with MusicCategoryDetail
    * @param mMusicCategory is list of MusicCategoryDetail
    * */
    public SongDetail(int ImageSongId, String SongTitle, String SongAlbum, String SongAuthor, String SongLength, int SongFile) {
        mImageSongId = ImageSongId;
        mSongTitle = SongTitle;
        mSongAlbum = SongAlbum;
        mSongAuthor = SongAuthor;
        mSongLength = SongLength;
        mSongFile = SongFile;
    }

    /**
     * Get the image resource ID
     */
    public int getImageSongId() {
        return mImageSongId;
    }

    /**
     * Get the Song title
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the name of the album
     */
    public String getSongAlbum() {
        return mSongAlbum;
    }

    /**
     * Get the author name
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }

    /**
     * Get the length of the song
     */
    public String getSongLength() {
        return mSongLength;
    }

    /**
     * Get the song file
     */
    public int getSongFile() {return mSongFile; }
}
