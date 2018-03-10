package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_play);

        TextView songName = findViewById(R.id.detail_song_title);
        TextView albumName = findViewById(R.id.detail_song_album);
        Intent intent = new Intent(this, NowPlay.class);
  //      String name = songName.getText().toString();
   //     String album = albumName.getText().toString();
     //   intent.putExtra("song_name", name);
       // intent.putExtra("song_album", album);
    }
}
