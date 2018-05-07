package com.example.bt_1n3_05.harvestvalleytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import pl.droidsonroids.gif.GifImageView;

/**
 * Created by BT_1N3_05 on 4/13/2018.
 */

public class FarmScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farm);

        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
//        gifImageView.setGifImageResource(R.drawable.doggie);
        }
    }



