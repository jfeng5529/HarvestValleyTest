package com.example.bt_1n3_05.harvestvalleytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SoundScreen extends AppCompatActivity {

    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_screen);
//        mySong = MediaPlayer.create(SoundScreen.this, R.raw.sound);
//        mySong.start();
//        Thread thread = new Thread(){
//          public void run(){
//              try{
//                  sleep(1000);
//              }catch (Exception e){
//
//              }finally {
//                  Intent i = new Intent (SoundScreen.this.FirstActivity.class);
//                  startActivity(i);
//              }
//          }
//        };

    }
}

//package com.example.bt_1n3_05.harvestvalleytest;
//
//        import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//
///**
// * Created by BT_1N3_05 on 4/13/2018.
// */
//
//public class FarmScreen extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.farm);
//    }
//}
