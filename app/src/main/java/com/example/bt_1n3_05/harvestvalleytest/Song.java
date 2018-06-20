package com.example.bt_1n3_05.harvestvalleytest;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Song extends Activity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound);

        mediaPlayer.start();

    }
}
