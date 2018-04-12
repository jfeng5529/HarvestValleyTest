package com.example.bt_1n3_05.harvestvalleytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SoundScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onButtonItems(View v){
        Toast test = Toast.makeText(getApplicationContext(), "HEYY!", Toast.LENGTH_LONG);
        test.show();
    }
}
