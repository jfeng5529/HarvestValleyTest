package com.example.bt_1n3_05.harvestvalleytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by BT_1N3_03 on 4/25/2018.
 */

class ItemMenu extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.itemwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout( (int)(width*.5),(int)(height*.5));
    }
}
