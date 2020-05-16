package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BundleActivity extends AppCompatActivity {
    public static String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
    }

    public void toFirstText(View view) {
        Intent toFirstTextIntent = new Intent(BundleActivity.this, BundleInfo.class);
        toFirstTextIntent.putExtra(MESSAGE, getString(R.string.text_one));
        startActivity(toFirstTextIntent);
    }

    public void toSecondText(View view) {
        Intent toSecondTextIntent = new Intent(BundleActivity.this, BundleInfo.class);
        toSecondTextIntent.putExtra(MESSAGE, getString(R.string.text_two));
        startActivity(toSecondTextIntent);
    }

    public void toThirdText(View view) {
        Intent toThirdTextIntent = new Intent(BundleActivity.this, BundleInfo.class);
        toThirdTextIntent.putExtra(MESSAGE, getString(R.string.text_three));
        startActivity(toThirdTextIntent);
    }
}
