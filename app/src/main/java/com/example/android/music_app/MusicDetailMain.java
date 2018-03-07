package com.example.android.music_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicDetailMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_detail);

        // Create an arrayList of words
        ArrayList<MusicDetail> musicDetail = new ArrayList<MusicDetail>();
        musicDetail.add(new MusicDetail(R.drawable.artist, "1. Beautiful Day","All that you can't leave behind","U2", "4:06"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "2. Stuck in a Moment You Can't Get Out Of","All that you can't leave behind","U2","4:32" ));
        musicDetail.add(new MusicDetail(R.drawable.artist, "3. Elevation","All that you can't leave behind","U2","3:45"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "4. Walk On","All that you can't leave behind","U2","4:55"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "5. Kite","All that you can't leave behind","U2","4:23"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "6. In a Little While","All that you can't leave behind","U2","3:37"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "7. Wild Honey","All that you can't leave behind","U2","3:47"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "8. Peace on Earth","All that you can't leave behind","U2","4:46"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "9. When I Look at the World","All that you can't leave behind","U2","4:15"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "10. New York","All that you can't leave behind","U2","5:28"));
        musicDetail.add(new MusicDetail(R.drawable.artist, "11. Grace","All that you can't leave behind","U2","5:31"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicDetailAdapter itemsAdapter = new MusicDetailAdapter(this, musicDetail);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.songs);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

/** PROBLEM - NULL OBJECT REFERENCE - PROTOŽE JE TO PRVEK CO JE NATVRDO V DETAIL_ITEM.XML NAROZDÍL
 * OD OSTATNÍHO, CO VOLÁM PŘES ARRAY LIST. TENTO FILE NEZNÁ LAYOUT DETAIL ITEM (SET CONTENT VIEW JDE
 * NA JINOU AKTIVITU), MOŽNÁ PŘES INTENT, NEBO DÁT TAKY DO ARRAY, I KDYŽ JE TO OPAKUJÍCÍ SE PARAMETR?
 *
        ImageView playButton = (ImageView) findViewById(R.id.play);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent nowPlay = new Intent(getApplicationContext(), NowPlay.class);

                // Start the new activity
                startActivity(nowPlay);
            }
        });

            **/
    }
}