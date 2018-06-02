package com.example.bt_1n3_05.harvestvalleytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.bt_1n3_05.harvestvalleytest.R;

public class InventoryScreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);
    }

    public void onClickItem(View v){
        startActivity(new Intent(InventoryScreen.this, ItemMenu.class));

    }
}
