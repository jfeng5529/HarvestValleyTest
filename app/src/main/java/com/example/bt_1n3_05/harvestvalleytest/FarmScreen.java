package com.example.bt_1n3_05.harvestvalleytest;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.res.FontResourcesParserCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import android.widget.ImageButton;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;


/**
 * Created by BT_1N3_05 on 4/13/2018.
 */

public class FarmScreen extends AppCompatActivity {
    //28 by 34
//     private static final int FRAME_W = 28;
//     private static final int FRAME_H = 34;
//     private static final int NB_FRAMES = 35;
//     private static final int COUNT_X = 4;
//     private static final int COUNT_Y = 9;
//     private static final int FRAME_DURATION = 120;
//     private static final int SCALE_FACTOR = 4;
//     private ImageView dog;
//     private Bitmap[] bmps;
    boolean[] planted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farm);
        planted = new boolean[25];
        for(boolean i:planted){
            i=false;
        }
//         dog = (ImageView) findViewById(R.id.dog);

//         Bitmap dogBmp = getBitmap(this, "doggie.png");

//         if(dogBmp != null){
//             bmps = new Bitmap[NB_FRAMES];
//             int currentFrame = 0;

//             for(int i = 0; i< COUNT_Y; i++){
//                 for(int j = 0; j <  COUNT_X; j++ ){
//                     bmps[currentFrame] = Bitmap.createBitmap(dogBmp, FRAME_W +j
//                     , FRAME_W + i, FRAME_W,FRAME_H);

//                     bmps[currentFrame] = Bitmap.createScaledBitmap(bmps[currentFrame], FRAME_W * SCALE_FACTOR,
//                     FRAME_H * SCALE_FACTOR, true);

//                     if(++currentFrame >= NB_FRAMES){
//                         break;
//                     }
//                 }
//             }

//             final AnimationDrawable animation = new AnimationDrawable();
//             animation.setOneShot(false);

//             for(int i= 0; i< NB_FRAMES; i++){
//                 animation.addFrame(new BitmapDrawable(getResources(),bmps[i]),FRAME_DURATION);
//             }

//             if(Build.VERSION.SDK_INT <16){
//                 dog.setBackgroundDrawable(animation);
//             }
//             else{
//                 dog.setBackground(animation);
//             }

//             dog.post(new Runnable() {

//                 @Override
//                 public void run() {
//                     animation.start();
//                 }
//             });


//         }


//         }

//     private Bitmap getBitmap(FarmScreen farmScreen, String filepath) {
//         AssetManager assetManager = farmScreen.getAssets();
//         InputStream intr = null;
//         Bitmap bitmap = null;

//         try{
//             intr = assetManager.open(filepath);
//             bitmap = BitmapFactory.decodeStream(intr);
//         }
//         catch(IOException ioe){
//     } finally {
//         if(intr != null) {
//             try{
//                 intr.close();
//             }
//             catch(IOException ioe){
//             }
//         }
//     }
//     return bitmap;
// }
// }

    }
    public void plantCrop(View v) {
        final int []imageArray={R.drawable.cornst1,R.drawable.cornst2,R.drawable.cornst3,R.drawable.cornst4,R.drawable.cornst5,R.drawable.cornst6,R.drawable.pepperst1,R.drawable.pepperst2,R.drawable.pepperst3,R.drawable.pepperst4,R.drawable.pepperst5,R.drawable.pepperst6,
                R.drawable.potatost1,R.drawable.potatost2,R.drawable.potatost3,R.drawable.potatost4,R.drawable.potatost5,R.drawable.potatost6,
                R.drawable.strawberryst1,R.drawable.strawberryst2,R.drawable.strawberryst3,R.drawable.strawberryst4,R.drawable.strawberryst5,R.drawable.strawberryst6,
                R.drawable.tomatost1,R.drawable.tomatost2,R.drawable.tomatost3,R.drawable.tomatost4,R.drawable.tomatost5,R.drawable.tomatost6,
                R.drawable.wheatst1,R.drawable.wheatst2,R.drawable.wheatst3,R.drawable.wheatst4,R.drawable.wheatst5};
        final int[] numArray={R.id.imageButton16,R.id.imageButton18,R.id.imageButton19,R.id.imageButton20,R.id.imageButton21,R.id.imageButton22,R.id.imageButton23,R.id.imageButton24,
                R.id.imageButton25,R.id.imageButton26,R.id.imageButton27,R.id.imageButton28,R.id.imageButton36,R.id.imageButton37
                ,R.id.imageButton38,R.id.imageButton39,R.id.imageButton40,R.id.imageButton41,R.id.imageButton42,R.id.imageButton43,R.id.imageButton44,R.id.imageButton45,R.id.imageButton46,R.id.imageButton29,R.id.imageButton32};
       final int id = v.getId();
        final Handler handler = new Handler();
       switch (id) {
           case R.id.imageButton16:
               if (checkPlanted(numArray[0],0)==true) {
                   changeImg(0, 5, numArray[0], 0, imageArray, handler);
                   planted[0] = true;
               }
               break;
           case R.id.imageButton18:
               changeImg(6,11,numArray[1],1,imageArray,handler);
               break;
           case R.id.imageButton19:
               changeImg(12,17,numArray[2],2,imageArray,handler);
               break;
           case R.id.imageButton20:
               changeImg(18,23,numArray[3],3,imageArray,handler);
               break;
           case R.id.imageButton21:
               changeImg(18,23,numArray[4],4,imageArray,handler);
               break;
           case R.id.imageButton22:
               changeImg(24,29,numArray[5],5,imageArray,handler);
               break;
           case R.id.imageButton23:
               changeImg(6,11,numArray[6],6,imageArray,handler);
               break;
           case R.id.imageButton24:
               changeImg(0,5,numArray[7],7,imageArray,handler);
               break;
               case R.id.imageButton25:
               changeImg(12,17,numArray[8],8,imageArray,handler);
               break;
           case R.id.imageButton26:
               changeImg(18,23,numArray[9],9,imageArray,handler);
               break;
           case R.id.imageButton27:
               changeImg(24,29,numArray[10],10,imageArray,handler);
               break;
           case R.id.imageButton28:
               changeImg(6,11,numArray[11],11,imageArray,handler);
               break;
           case R.id.imageButton36:
               changeImg(0,5,numArray[12],12,imageArray,handler);
               break;
           case R.id.imageButton37:
               changeImg(18,23,numArray[13],13,imageArray,handler);
               break;
           case R.id.imageButton38:
               changeImg(24,29,numArray[14],14,imageArray,handler);
               break;
           case R.id.imageButton39:
               changeImg(24,29,numArray[15],15,imageArray,handler);
               break;
           case R.id.imageButton40:
               changeImg(0,5,numArray[16],16,imageArray,handler);
               break;
           case R.id.imageButton41:
               changeImg(24,29,numArray[17],17,imageArray,handler);
               break;
               case R.id.imageButton42:
               changeImg(6,11,numArray[18],18,imageArray,handler);
               break;
           case R.id.imageButton43:
               changeImg(24,29,numArray[19],19,imageArray,handler);
               break;
           case R.id.imageButton44:
               changeImg(18,23,numArray[20],20,imageArray,handler);
               break;
           case R.id.imageButton45:
               changeImg(24,29,numArray[21],21,imageArray,handler);
               break;
           case R.id.imageButton46:
               changeImg(12,17,numArray[22],22,imageArray,handler);
               break;
           case R.id.imageButton29:
               changeImg(24,29,numArray[23],23,imageArray,handler);
               break;

           case R.id.imageButton32:
               changeImg(24,29,numArray[24],24,imageArray,handler);
               break;

        }
    }

    private boolean checkPlanted(int num, int index) {
        ImageButton img = (ImageButton) findViewById(num);
        if (planted[index] == true) {
            img.setImageResource(R.drawable.patch);
            planted[index] = false;
            return false;
        }
        else{
            return true;
        }
    }

    public void changeImg(final int start, final int end,final int num, final int index, final int[] imageArray, final Handler handler){
        Runnable runnable = new Runnable() {
            int i=start;
            public void run() {
                ImageButton img = (ImageButton) findViewById(num);
                    img.setImageResource(imageArray[i]);
                    i++;
                    if (i > end) {
                        return;
                    }
                    handler.postDelayed(this, 1200);  //for interval...
                }

        };
        handler.postDelayed(runnable, 2000); //for initial delay..
    }

}


        /**switch (id) {
            case R.id.button1:
                // your code for button1 here
                break;
            case R.id.button2:
                // your code for button2 here
                break;
            // even more buttons here**/
