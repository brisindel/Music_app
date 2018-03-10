package com.example.android.music_app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by uLeho on 05.03.2018.
 */

public class SongDetailAdapter extends ArrayAdapter<SongDetail> {

    private static final String LOG_TAG = SongDetailAdapter.class.getSimpleName();
    private Context context;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param songDetail A List of AndroidFlavor objects to display in a list
     */
    public SongDetailAdapter(Activity context, ArrayList<SongDetail> songDetail) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songDetail);
        this.context = context;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.detail_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        SongDetail songDetail = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.detail_item_image);
        iconView.setImageResource(songDetail.getImageSongId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.detail_song_title);
        titleTextView.setText(songDetail.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.detail_song_album);
        albumTextView.setText(songDetail.getSongAlbum());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.detail_song_author);
        authorTextView.setText(songDetail.getSongAuthor());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView lengthTextView = (TextView) listItemView.findViewById(R.id.detail_song_length);
        lengthTextView.setText(songDetail.getSongLength());

        ImageView playButton = (ImageView) listItemView.findViewById(R.id.play);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent nowPlay = new Intent(context, NowPlay.class);

                // Start the new activity
                context.startActivity(nowPlay);
            }
        });

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
