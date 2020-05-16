package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StandardIntents extends AppCompatActivity {
    EditText editTextWebsite;
    EditText editTextLocation;
    EditText editTextShare;
    EditText editTextCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_intents);
        editTextWebsite = findViewById(R.id.editTextWebsite);
        editTextLocation = findViewById(R.id.editTextLocation);
        editTextShare = findViewById(R.id.editTextShare);
        editTextCall = findViewById(R.id.editTextPhone);
    }

    public void openWebsiteOnClick(View view) {
        Intent openWebsiteImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openWebsiteImplicitIntent.setData(Uri.parse(editTextWebsite.getText().toString()));
        startActivity(openWebsiteImplicitIntent);
    }

    public void openLocationOnClick(View view) {
        Intent openLocationImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openLocationImplicitIntent.setData(Uri.parse("geo:0,0?q=" + editTextLocation.getText().toString()));
        openLocationImplicitIntent.setPackage("com.google.android.apps.maps");
        startActivity(openLocationImplicitIntent);
    }

    public void shareTextOnClick(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, editTextShare.getText().toString());
        startActivity(Intent.createChooser(shareIntent,"Share"));
    }

    public void callOnClick(View view) {
        Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);
        callImplicitIntent.setData(Uri.parse("tel:" + editTextCall.getText().toString()));
        startActivity(callImplicitIntent);
    }
}
