package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumDetailMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_detail);

        // Create an arrayList of words
        ArrayList<MusicCategory> albumDetail = new ArrayList<MusicCategory>();
        albumDetail.add(new MusicCategory(R.drawable.boy, "U2: Boy"));
        albumDetail.add(new MusicCategory(R.drawable.october, "U2: October"));
        albumDetail.add(new MusicCategory(R.drawable.war, "U2: War"));
        albumDetail.add(new MusicCategory(R.drawable.under_a_blood_red_sky, "U2: Under a blood red sky"));
        albumDetail.add(new MusicCategory(R.drawable.the_unforgettable_fire, "U2: The Unforgettable Fire "));
        albumDetail.add(new MusicCategory(R.drawable.the_joshua_tree, "U2: The Joshua Tree"));
        albumDetail.add(new MusicCategory(R.drawable.rattle_and_hum, "U2: Rattle and Hum"));
        albumDetail.add(new MusicCategory(R.drawable.achtung_baby, "U2: Achtung Baby"));
        albumDetail.add(new MusicCategory(R.drawable.u2_zooropa, "U2: Zooropa"));
        albumDetail.add(new MusicCategory(R.drawable.pop, "U2: Pop"));
        albumDetail.add(new MusicCategory(R.drawable.all_that_you_cant_leave_behind, "U2: All That You Can't Leave Behind"));
        albumDetail.add(new MusicCategory(R.drawable.how_to_dismantle_an_atomic_bomb, "U2: How to Dismantle an Atomic Bomb"));
        albumDetail.add(new MusicCategory(R.drawable.no_line_on_the_horizon, "U2: No Line on the Horizon"));
        albumDetail.add(new MusicCategory(R.drawable.songs_of_innocence, "U2: Songs of Innocence"));
        albumDetail.add(new MusicCategory(R.drawable.songs_of_experience, "U2: Songs of Experience"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicCategoryAdapter itemsAdapter = new MusicCategoryAdapter(this, albumDetail);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        GridView gridView = (GridView) findViewById(R.id.grid_album);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        gridView.setAdapter(itemsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SongDetail.class);
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





        // Set a click listener on that View
     //   gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       //     @Override
         //   public void onItemClick(AdapterView<?> a, View v, int position,
           //                         long id) {
                // Create a new intent to open the {@link FamilyActivity}
             //   Intent familyIntent = new Intent(AlbumDetailMain.this, SongDetail.class);

                // Start the new activity
               // startActivity(familyIntent);
            }
       // });
  //  }
}
