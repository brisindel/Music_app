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
        ArrayList<MusicCategory> musicCategories = new ArrayList<MusicCategory>();
        musicCategories.add(new MusicCategory(R.drawable.artist, "Songs"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Album"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "AnythingElse"));

        // Create adapter
        MusicCategoryAdapter itemsAdapter = new MusicCategoryAdapter(this, musicCategories);

        // Find the object for arrayList
        GridView gridView = (GridView) findViewById(R.id.grid_music);

        // Set adapter on object of arrayList
        gridView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SongsDetailMain.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), AlbumDetailMain.class);
                        break;
                    default:
                        intent = new Intent(getApplicationContext(), SongsDetailMain.class);
                        break;
                }

                if (intent != null) {
                    startActivity(intent);

                }
            }
        });
    }
}