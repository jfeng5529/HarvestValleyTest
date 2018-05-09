package com.example.bt_1n3_05.harvestvalleytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BT_1N3_05 on 4/13/2018.
 */

public class FarmScreen extends AppCompatActivity {
    private Button market;

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
    }
    public void openMarketScreen(){
        Intent intent = new Intent(this, InventoryScreen.class);
        startActivity(intent);
    }
}
