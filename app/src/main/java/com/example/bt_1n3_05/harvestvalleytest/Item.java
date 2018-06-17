package com.example.bt_1n3_05.harvestvalleytest;

import android.app.Activity;

/**
 * Created by BT_1N3_02 on 6/8/2018.
 */

public class Item extends Activity {
    private String name;
    private int imageIndx;
    private String description;
    private int value;
    private boolean selected;
    private int amount;
    private boolean added;
    private int time;

    public Item(String name, String description, int value, int imageIndex, int time) {
        this.name = name;
        this.imageIndx = imageIndex;
        this.value = value;
        this.description = description;
        this.selected = false;
        this.added = false;
        this.time = time;

} public Item() {}

    public boolean isSelected(){
        return selected;
    }

    public void setSelected(boolean b){
        selected = b;
    }
}
