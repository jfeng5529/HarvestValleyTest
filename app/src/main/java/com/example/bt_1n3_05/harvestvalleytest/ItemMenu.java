package com.example.bt_1n3_05.harvestvalleytest;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.*;

/**
 * Created by BT_1N3_03 on 4/25/2018.
 */

public class ItemMenu extends Activity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        InventoryScreen s = new InventoryScreen();
        setContentView(R.layout.itemwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout( (int)(width*.5),(int)(height*.3));
        // ItemMenu.showAtLocation(dm, Gravity.TOP|Gravity.LEFT, location.left, location.bottom);
    }
}
