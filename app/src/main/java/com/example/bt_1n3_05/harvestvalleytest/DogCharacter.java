package com.example.bt_1n3_05.harvestvalleytest;

import android.graphics.Bitmap;

/**
 * Created by BT_1N3_06 on 5/29/2018.
 */

public class DogCharacter extends CharacterMovement {
    protected final int topToBottom = 0;
    protected final int rightToLeft = 1;
    protected final int leftToRight = 2;
    protected final int bottomToTop = 3;

    public DogCharacter(Bitmap image, int rowCount, int colCount, int x, int y) {
        super(image, rowCount, colCount, x, y);
    }
}
