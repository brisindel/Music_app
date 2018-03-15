package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BoyDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_detail);

        // Create an arrayList of words
        final ArrayList<SongDetail> boyDetailList = new ArrayList<SongDetail>();
        boyDetailList.add(new SongDetail(R.drawable.boy, "I Will Follow", "Boy", "U2", "3:40", R.raw.first));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Twilight", "Boy", "U2", "4:22", R.raw.second));
        boyDetailList.add(new SongDetail(R.drawable.boy, "An Cat Dubh", "Boy", "U2", "4:46", R.raw.thirth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Into the Heart", "Boy", "U2", "3:27", R.raw.forth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Out of Control", "Boy", "U2", "4:12", R.raw.fifth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Stories for Boys", "Boy", "U2", "3:04", R.raw.first));
        boyDetailList.add(new SongDetail(R.drawable.boy, "The Ocean", "Boy", "U2", "1:34", R.raw.second));
        boyDetailList.add(new SongDetail(R.drawable.boy, "A Day Without Me", "Boy", "U2", "3:12", R.raw.thirth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Another Time, Another Place", "Boy", "U2", "4:31", R.raw.forth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "The Electric Co.", "Boy", "U2", "4:47", R.raw.fifth));
        boyDetailList.add(new SongDetail(R.drawable.boy, "Shadows and Tall Trees", "Boy", "U2", "5:13", R.raw.first));

        // Create adapter
        SongDetailAdapter itemsAdapter = new SongDetailAdapter(this, boyDetailList);

        // Find the object for arrayList
        ListView BoyDetailListView = (ListView) findViewById(R.id.songs_list_view);

        // Set adapter on object of arrayList
        BoyDetailListView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        BoyDetailListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent intent = new Intent(BoyDetailActivity.this, NowPlayActivity.class);

                SongDetail selectedSong = boyDetailList.get(position);
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

    }
}

