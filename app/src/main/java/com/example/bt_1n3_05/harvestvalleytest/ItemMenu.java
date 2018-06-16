package com.example.bt_1n3_05.harvestvalleytest;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;

/**
 * Created by BT_1N3_03 on 4/25/2018.
 */

public class ItemMenu extends Activity{
   public static final Item[] preItem = {new Item("Corn Seeds", "Great crop to grow all year round", 250, 1, 4),new Item("Garlic Seeds", "Stinky but GOOOOD", 150, 2,1),new Item("Pepper Seeds", "Spicy", 50, 3,1),
            new Item("Potato Seeds", "Just like me", 150, 4, 3),new Item("Strawberry Seeds", "Sweeter than you", 100, 5,2),
            new Item("Tomato Seeds", "Make some good ketchup", 200, 6,3),new Item("Wheat Seeds", "Not weed", 300,6,5), new Item("Black Chicken", "Cluck cluck", 250, 14,1),new Item("Brown Chicken", "Cluck cluck", 250, 12,1),new Item("White Chicken", "Cluck cluck", 250, 13,1),
            new Item("Sheep", "BAAAAAAAAAAAH", 350, 15,2),
            new Item("Cow", "Mooooooo", 400, 16,2),new Item("Pig", "SNORT SNORT", 450, 17,1)};

    public static final Item[] afttems ={new Item("Corn", "Fresh to eat", 300,6,4),
            new Item("Pepper","Supah Hot Fire",60,7,1),new Item("Potato","Time to make french fries",180,8,3),
            new Item("Strawberry","Berry??",120,9,2),new Item("Tomato", "Great for salads", 240,10,3),
            new Item("Wheat","Just plain old wheat",360,11,5), new Item("Brown Eggs", "Organic", 200, 18, 0),new Item("White Eggs", "Non-Organic", 200, 19,0),
            new Item("Black Eggs", "Does not contain egg whites", 200, 20, 0),new Item("Wool", "Canada Goose", 300, 21,0),
            new Item("Milk", "An utter-disaster", 350, 22,0),new Item("Meat", "Mmmmmmm tasty", 500, 23,0)};
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.itemwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout( (int)(width*.5),(int)(height*.3));
       // ItemMenu.showAtLocation(dm, Gravity.TOP|Gravity.LEFT, location.left, location.bottom);
    }
}
