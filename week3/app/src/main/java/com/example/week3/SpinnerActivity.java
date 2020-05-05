package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    private Spinner spinner;
    private ArrayList<String> androidVersions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinnerAndroid);
        setSpinnerSource();
        spinner.setAdapter((getSpinnerAdapter()));
    }
    private void setSpinnerSource(){
        androidVersions = new ArrayList<>();
        androidVersions.add("Cupcake");
        androidVersions.add("Donut");
        androidVersions.add("Eclair");
        androidVersions.add("KitKat");
        androidVersions.add("Pie");
    }
    private ArrayAdapter<String> getSpinnerAdapter(){
        return new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item, androidVersions);
    }
}
