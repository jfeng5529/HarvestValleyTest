package com.example.bt_1n3_05.harvestvalleytest;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.io.IOException;
import java.io.InputStream;

/**
 * Created by BT_1N3_05 on 4/13/2018.
 */

public class FarmScreen extends AppCompatActivity {

    private Button market;
    //28 by 34
    private static final int FRAME_W = 28;
    private static final int FRAME_H = 34;
    private static final int NB_FRAMES = 35;
    private static final int COUNT_X = 4;
    private static final int COUNT_Y = 9;
    private static final int FRAME_DURATION = 120;
    private static final int SCALE_FACTOR = 4;
    private ImageView dog;
    private Bitmap[] bmps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farm);

        market = findViewById(R.id.market);
        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarketScreen();
            }
        });

        dog = (ImageView) findViewById(R.id.dog);

        Bitmap dogBmp = getBitmap(this, "doggie.png");

        if(dogBmp != null){
            bmps = new Bitmap[NB_FRAMES];
            int currentFrame = 0;

            for(int i = 0; i< COUNT_Y; i++){
                for(int j = 0; j <  COUNT_X; j++ ){
                    bmps[currentFrame] = Bitmap.createBitmap(dogBmp, FRAME_W +j
                            , FRAME_W + i, FRAME_W,FRAME_H);

                    bmps[currentFrame] = Bitmap.createScaledBitmap(bmps[currentFrame], FRAME_W * SCALE_FACTOR,
                            FRAME_H * SCALE_FACTOR, true);

                    if(++currentFrame >= NB_FRAMES){
                        break;
                    }
                }
            }

            final AnimationDrawable animation = new AnimationDrawable();
            animation.setOneShot(false);

            for(int i= 0; i< NB_FRAMES; i++){
                animation.addFrame(new BitmapDrawable(getResources(),bmps[i]),FRAME_DURATION);
            }

            if(Build.VERSION.SDK_INT <16){
                dog.setBackgroundDrawable(animation);
            }
            else{
                dog.setBackground(animation);
            }

            dog.post(new Runnable() {

                @Override
                public void run() {
                    animation.start();
                }
            });


        }
    }


    public void openMarketScreen(){
        Intent intent = new Intent(this, InventoryScreen.class);
        startActivity(intent);
    }


    private Bitmap getBitmap(FarmScreen farmScreen, String filepath) {
        AssetManager assetManager = farmScreen.getAssets();
        InputStream intr = null;
        Bitmap bitmap = null;

        try{
            intr = assetManager.open(filepath);
            bitmap = BitmapFactory.decodeStream(intr);
        }
        catch(IOException ioe){
    } finally {
        if(intr != null) {
            try{
                intr.close();
            }
            catch(IOException ioe){
            }
        }
    }
    return bitmap;
}
}



