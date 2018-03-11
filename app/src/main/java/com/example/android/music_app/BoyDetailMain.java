package com.example.android.music_app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class BoyDetailMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_detail);

        // Create an arrayList of words
        final ArrayList<SongDetail> boyDetail = new ArrayList<SongDetail>();
        boyDetail.add(new SongDetail(R.drawable.boy, "I Will Follow", "Boy", "U2", "3:40"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Twilight", "Boy", "U2", "4:22"));
        boyDetail.add(new SongDetail(R.drawable.boy, "An Cat Dubh", "Boy", "U2", "4:46"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Into the Heart", "Boy", "U2", "3:27"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Out of Control", "Boy", "U2", "4:12"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Stories for Boys", "Boy", "U2", "3:04"));
        boyDetail.add(new SongDetail(R.drawable.boy, "The Ocean", "Boy", "U2", "1:34"));
        boyDetail.add(new SongDetail(R.drawable.boy, "A Day Without Me", "Boy", "U2", "3:12"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Another Time, Another Place", "Boy", "U2", "4:31"));
        boyDetail.add(new SongDetail(R.drawable.boy, "The Electric Co.", "Boy", "U2", "4:47"));
        boyDetail.add(new SongDetail(R.drawable.boy, "Shadows and Tall Trees", "Boy", "U2", "5:13"));

        // Create adapter
        SongDetailAdapter itemsAdapter = new SongDetailAdapter(this, boyDetail);

        // Find the object for arrayList
        ListView listView = (ListView) findViewById(R.id.songs);

        // Set adapter on object of arrayList
        listView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent intent = new Intent(BoyDetailMain.this, NowPlay.class);

                TextView songName = (TextView) findViewById(R.id.detail_song_title);
                TextView albumName = (TextView) findViewById(R.id.detail_song_album);
                TextView lengthSong = (TextView) findViewById(R.id.detail_song_length);
                ImageView imageView = (ImageView) findViewById(R.id.detail_item_image);

                String name = songName.getText().toString();
                String album = albumName.getText().toString();
                String length = lengthSong.getText().toString();
                Bitmap image = imageView.getDrawingCache();
                intent.putExtra("song_name", name);
                intent.putExtra("song_album", album);
                intent.putExtra("song_length", length);
                intent.putExtra("image", image);

                // Start the new activity
                startActivity(intent);
            }
        });

        //Set rating from NowPlay

        Intent intent = getIntent();

        RatingBar nowRatingBar = findViewById(R.id.songRating);
        final String ratingValue = intent.getStringExtra("ratingValue");

    }
}

