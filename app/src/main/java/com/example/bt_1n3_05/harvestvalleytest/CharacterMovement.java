package com.example.bt_1n3_05.harvestvalleytest;

/**
 * Created by BT_1N3_06 on 5/29/2018.
 */

import android.graphics.Bitmap;

public abstract class CharacterMovement {

    private Bitmap image;

    private final int rowCount;
    private final int colCount;
    private final int WIDTH;
    private final int HEIGHT;
    private final int width;
    private final int height;
    private int x;
    private int y;

    public CharacterMovement(Bitmap image, int rowCount, int colCount, int x, int y){
        this.image = image;
        this.rowCount = rowCount;
        this.colCount = colCount;

        this.x = x;
        this.y = y;

        this.WIDTH = image.getWidth();
        this.HEIGHT = image.getHeight();

        this.width = this.WIDTH/ colCount;
        this.height= this.HEIGHT/ rowCount;
    }

    public Bitmap createSubImageAt(int row, int col){

        Bitmap subImage = Bitmap.createBitmap(image, col* width, row* height ,width,height);
        return subImage;
    }

    public int getX()  {
        return this.x;
    }

    public int getY()  {
        return this.y;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
