package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.category);

        // Create an arrayList of words
        ArrayList<MusicCategoryDetail> musicCategoryList = new ArrayList<MusicCategoryDetail>();
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "Songs"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "Album"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));
        musicCategoryList.add(new MusicCategoryDetail(R.drawable.artist, "AnythingElse"));

        // Create adapter
        MusicCategoryAdapter itemsAdapter = new MusicCategoryAdapter(this, musicCategoryList);

        // Find the object for arrayList
        GridView musicCategoryGridView = (GridView) findViewById(R.id.grid_music);

        // Set adapter on object of arrayList
        musicCategoryGridView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        musicCategoryGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SongsDetailActivity.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), AlbumDetailActivity.class);
                        break;
                    default:
                        intent = new Intent(getApplicationContext(), SongsDetailActivity.class);
                        break;
                }

                if (intent != null) {
                    startActivity(intent);

                }
            }
        });
    }
}