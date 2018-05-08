package com.example.bt_1n3_05.harvestvalleytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseGenderScreen extends AppCompatActivity {
    private ImageButton girlButton;
    private ImageButton boyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_gender_screen);

        girlButton = findViewById(R.id.girlButton);
        girlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFarmScreen();
            }
        });

        boyButton = findViewById(R.id.boyButton);
        boyButton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                openFarmScreen();
            }
        });
    }
    public void openFarmScreen(){
        Intent intent = new Intent(this, FarmScreen.class);
        startActivity(intent);
    }
}
