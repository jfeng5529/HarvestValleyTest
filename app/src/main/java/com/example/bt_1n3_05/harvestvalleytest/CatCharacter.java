package com.example.bt_1n3_05.harvestvalleytest;

/**
 * Created by BT_1N3_06 on 5/29/2018.
 */

import android.graphics.Bitmap;

public class CatCharacter extends CharacterMovement {
    protected final int topToBottom = 0;
    protected final int rightToLeft = 1;
    protected final int leftToRight = 2;
    protected final int bottomToTop = 3;

    public CatCharacter(Bitmap image, int rowCount, int colCount, int x, int y) {
        super(image, rowCount, colCount, x, y);
    }
}
