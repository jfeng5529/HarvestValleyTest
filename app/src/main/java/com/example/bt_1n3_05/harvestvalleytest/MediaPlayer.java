package com.example.bt_1n3_05.harvestvalleytest;

import android.media.AudioRouting;
import android.media.VolumeAutomation;

public abstract class MediaPlayer extends Object implements VolumeAutomation,AudioRouting{

    public static MediaPlayer create(MainActivity mainActivity, int sound) {
    }
}
