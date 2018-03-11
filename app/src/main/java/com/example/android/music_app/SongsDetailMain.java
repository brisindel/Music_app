package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


public class SongsDetailMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_detail);

        // Create an arrayList of words
        final ArrayList<SongDetail> songsDetail = new ArrayList<SongDetail>();
        songsDetail.add(new SongDetail(R.drawable.artist, "Beautiful Day", "All that you can't leave behind", "U2", "4:06"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Stuck in a Moment You Can't Get Out Of", "All that you can't leave behind", "U2", "4:32"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Elevation", "All that you can't leave behind", "U2", "3:45"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Walk On", "All that you can't leave behind", "U2", "4:55"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Kite", "All that you can't leave behind", "U2", "4:23"));
        songsDetail.add(new SongDetail(R.drawable.artist, "In a Little While", "All that you can't leave behind", "U2", "3:37"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Wild Honey", "All that you can't leave behind", "U2", "3:47"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Peace on Earth", "All that you can't leave behind", "U2", "4:46"));
        songsDetail.add(new SongDetail(R.drawable.artist, "When I Look at the World", "All that you can't leave behind", "U2", "4:15"));
        songsDetail.add(new SongDetail(R.drawable.artist, "New York", "All that you can't leave behind", "U2", "5:28"));
        songsDetail.add(new SongDetail(R.drawable.artist, "Grace", "All that you can't leave behind", "U2", "5:31"));

        // Create adapter
        SongDetailAdapter itemsAdapter = new SongDetailAdapter(this, songsDetail);

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
                Intent intent = new Intent(SongsDetailMain.this, NowPlay.class);

//                TextView songName = (TextView) findViewById(R.id.detail_song_title);
//                TextView albumName = (TextView) findViewById(R.id.detail_song_album);
//                TextView lengthSong = (TextView) findViewById(R.id.detail_song_length);
//
//                String name = songName.getText().toString();
//                String album = albumName.getText().toString();
//                String length = lengthSong.getText().toString();

                SongDetail selectedSong = songsDetail.get(position);
                int image = selectedSong.getImageSongId();
                String name = selectedSong.getSongTitle();
                String album = selectedSong.getSongAlbum();
                String length = selectedSong.getSongLength();
                intent.putExtra("song_name", name);
                intent.putExtra("song_album", album);
                intent.putExtra("song_length", length);
                intent.putExtra("song_image", image);

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

