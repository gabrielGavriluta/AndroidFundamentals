package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BundleInfo extends AppCompatActivity {
    TextView bundleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_info);
        bundleText = findViewById(R.id.bundleText);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString(BundleActivity.MESSAGE);
            bundleText.setText(message);
        }
    }
}
