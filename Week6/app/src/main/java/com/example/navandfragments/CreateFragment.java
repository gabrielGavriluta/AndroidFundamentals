package com.example.navandfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CreateFragment extends AppCompatActivity {
    private TextView textView;
    public static String NRLETTERS= "nrLetters";
    public static String NRLETTERSINTRO = "nrLettersIntro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_fragment);
    }
}
