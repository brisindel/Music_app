package com.example.android.music_app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlay extends AppCompatActivity {

    String rating = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_play);

        /**Set text from intent
         * param Image
        //param songName
        //param albumName
        //param length
        **/

        Intent intent = getIntent();
     //   final ImageView image = intent.getDrawingCa("image");
        final String songName = intent.getStringExtra("song_name");
        final String albumName = intent.getStringExtra("song_album");
        final String length = intent.getStringExtra("song_length");

       // ImageView image = findViewById(R.id.now_image);
        TextView name = findViewById(R.id.song_name);
        TextView album = findViewById(R.id.album_name);
        TextView tvThumb = findViewById(R.id.nowLengthEnd);

      //  image.setImageBitmap(image);
        name.setText(songName);
        album.setText(albumName);
        tvThumb.setText(length);

        //After click on Play icon - change icon STOP, inicialize Seekbar
        final boolean[] nowplay = {false};
        final ImageView play = (ImageView) findViewById(R.id.nowPlay);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!nowplay[0]) {

                    //Set image STOP after click
                    play.setImageResource(R.drawable.stop);
                    nowplay[0] = true;

                    seekBar.setIndeterminate(true);

                } else {
                    //Set image PLAY after click
                    play.setImageResource(R.drawable.play);
                    nowplay[0] = false;

                    seekBar.setIndeterminate(false);
                }
            }
        });

        //OnClick button Previous
        ImageView previous = (ImageView) findViewById(R.id.nowPrevious);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(NowPlay.this,
                        "Play previous", Toast.LENGTH_LONG).show();
            }
        });

        //OnClick button Next
        ImageView next = (ImageView) findViewById(R.id.nowNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(NowPlay.this,
                        "Play next", Toast.LENGTH_LONG).show();

            }
        });

        //Rating bar intent

        RatingBar ratingBar = (RatingBar) findViewById(R.id.nowRatingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rating = Float.parseFloat(String.valueOf(rating));

                Intent intentRating = new Intent(NowPlay.this, SongsDetailMain.class);

                RatingBar ratingBarValue = (RatingBar) findViewById(R.id.songRating);

                String ratingValue = ratingBar.toString();
                intentRating.putExtra("ratingValue", ratingValue);
            }
        });
    }
}
