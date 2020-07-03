package com.example.styles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BatteryActivity extends AppCompatActivity {
    ImageView imageViewBattery;
    int level;
    public static int MAX_LEVEL = 7;
    public static int MIN_LEVEL = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        imageViewBattery = findViewById(R.id.imageViewBattery);
        level = MIN_LEVEL + 1;
        imageViewBattery.setImageLevel(level);
    }

    public void upBatteryOnClick(View view) {
        if(level < MAX_LEVEL) {
            level++;
            imageViewBattery.setImageLevel(level);
        }
    }

    public void downBatteryOnClick(View view) {
        if(level > MIN_LEVEL){
            level--;
            imageViewBattery.setImageLevel(level);
        }
    }
}
