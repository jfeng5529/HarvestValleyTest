package com.example.bt_1n3_05.harvestvalleytest;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton newButton;
    private ImageButton loadButton;
    private ImageButton musicButton;
    private ImageButton objectives;
    private ImageButton house;
    private ImageButton girlButton;
    private ImageButton boyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newButton = findViewById(R.id.newButton);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseGenderScreen();
            }
        });

        musicButton = findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSoundScreen();
            }
        });

        objectives = findViewById(R.id.objectives);
        objectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openObjectivesScreen();
            }
        });

        girlButton = findViewById(R.id.girlButton);
//        girlButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                openFarmScreen();
//            }
//        });

        boyButton = findViewById(R.id.boyButton);
//        boyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                openFarmScreen();
//            }
//        });

//        house = findViewById(R.id.house);
//        house.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openHouseScreen();
//            }
//        });
    }

    public void openChooseGenderScreen(){
        Intent intent = new Intent(this, ChooseGenderScreen.class);
        startActivity(intent);
    }

    public void openSoundScreen(){
        Intent intent = new Intent(this, SoundScreen.class);
        startActivity(intent);
    }

    public void openObjectivesScreen(){
        Intent intent = new Intent(this, ObjectiveScreen.class);
        startActivity(intent);
    }

    public void openFarmScreen(){
        Intent intent = new Intent(this, FarmScreen.class);
        startActivity(intent);
    }
//
//    public void openHouseScreen(){
//        Intent intent = new Intent(this, HouseScreen.class);
//        startActivity(intent);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

