package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an arrayList of words
        ArrayList<MusicCategory> musicCategories = new ArrayList<MusicCategory>();
        musicCategories.add(new MusicCategory(R.drawable.artist, "Songs"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Artist"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Album"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Favorites"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Recommend"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Playlist"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Recent"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Rock"));
        musicCategories.add(new MusicCategory(R.drawable.artist, "Pop"));

        // Verify the contents of the arrayList by printing out each array element to the logs
        //Log.v("NumbersActivity", "Word at index 0: " + words.get(0));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicCategoryAdapter itemsAdapter = new MusicCategoryAdapter(this, musicCategories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        GridView gridView = (GridView) findViewById(R.id.grid_music);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        gridView.setAdapter(itemsAdapter);

        // Set a click listener on that View
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, MusicDetailMain.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });
    }
}