package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
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

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongDetailAdapter itemsAdapter = new SongDetailAdapter(this, songsDetail);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.songs);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new intent to open the {@link FamilyActivity}

                TextView songName = findViewById(R.id.detail_song_title);
                TextView albumName = findViewById(R.id.detail_song_album);
                Intent intent = new Intent(SongsDetailMain.this, NowPlay.class);
                String name = songName.getText().toString();
                String album = albumName.getText().toString();
                intent.putExtra("song_name", name);
                intent.putExtra("song_album", album);

                // Start the new activity
                startActivity(intent);
            }
        });

    }
}

