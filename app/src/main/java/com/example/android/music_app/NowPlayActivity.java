package com.example.android.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_play);

        //Set text from intent Image, songName, albumName, param length

        Intent intent = getIntent();
        final int image = intent.getIntExtra("song_image", 0);
        final String songName = intent.getStringExtra("song_name");
        final String albumName = intent.getStringExtra("song_album");
        final String songLength = intent.getStringExtra("song_length");

        ImageView imageView = findViewById(R.id.now_image);
        TextView name = findViewById(R.id.song_name);
        TextView album = findViewById(R.id.album_name);
        TextView length = findViewById(R.id.nowLengthEnd);

        if (image != 0) {
            imageView.setImageResource(image);
        }

        //imageView.setImageResource(image);
        name.setText(songName);
        album.setText(albumName);
        length.setText(songLength);

        //After click on Play icon - change icon STOP, initialize Seeker
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

                Toast.makeText(NowPlayActivity.this,
                        "Play previous", Toast.LENGTH_LONG).show();
            }
        });

        //OnClick button Next
        ImageView next = (ImageView) findViewById(R.id.nowNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(NowPlayActivity.this,
                        "Play next", Toast.LENGTH_LONG).show();

            }
        });
    }
}
