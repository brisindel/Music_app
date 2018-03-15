package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_detail);

        // Create an arrayList of words
        final ArrayList<SongDetail> allThatYouCantLeaveDetailList = new ArrayList<SongDetail>();
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Beautiful Day", "All that you can't leave behind", "U2", "4:06", R.raw.first));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Stuck in a Moment You Can't Get Out Of", "All that you can't leave behind", "U2", "4:32", R.raw.second));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Elevation", "All that you can't leave behind", "U2", "3:45", R.raw.thirth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Walk On", "All that you can't leave behind", "U2", "4:55", R.raw.forth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Kite", "All that you can't leave behind", "U2", "4:23", R.raw.fifth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "In a Little While", "All that you can't leave behind", "U2", "3:37", R.raw.first));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Wild Honey", "All that you can't leave behind", "U2", "3:47", R.raw.second));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Peace on Earth", "All that you can't leave behind", "U2", "4:46", R.raw.thirth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "When I Look at the World", "All that you can't leave behind", "U2", "4:15", R.raw.forth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "New York", "All that you can't leave behind", "U2", "5:28", R.raw.fifth));
        allThatYouCantLeaveDetailList.add(new SongDetail(R.drawable.all_that_you_cant_leave_behind, "Grace", "All that you can't leave behind", "U2", "5:31", R.raw.first));

        // Create adapter
        SongDetailAdapter itemsAdapter = new SongDetailAdapter(this, allThatYouCantLeaveDetailList);

        // Find the object for arrayList
        ListView songDetailListView = (ListView) findViewById(R.id.songs_list_view);

        // Set adapter on object of arrayList
        songDetailListView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        songDetailListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new object intent (parse on position)
                Intent intent = new Intent(SongsDetailActivity.this, NowPlayActivity.class);

                SongDetail selectedSong = allThatYouCantLeaveDetailList.get(position);
                int image = selectedSong.getImageSongId();
                String name = selectedSong.getSongTitle();
                String album = selectedSong.getSongAlbum();
                String length = selectedSong.getSongLength();
                String file = String.valueOf(selectedSong.getSongFile());
                intent.putExtra("song_name", name);
                intent.putExtra("song_album", album);
                intent.putExtra("song_length", length);
                intent.putExtra("song_image", image);
                intent.putExtra("song_file", file);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}

