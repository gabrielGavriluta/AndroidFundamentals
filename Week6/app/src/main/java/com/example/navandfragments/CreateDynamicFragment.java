package com.example.navandfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class CreateDynamicFragment extends AppCompatActivity {
    private TextView textView;
    public static String NRLETTERS= "nrLetters";
    public static String NRLETTERSINTRO = "nrLettersIntro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dynamic_fragment);
        textView = findViewById(R.id.textViewDynamicFragment);
        openFragment();
    }

    private void openFragment() {
        // 4 steps to add dynamically a fragment inside of an activity
        // step 1: create an instance of FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // step 2: create an instance of FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // step 3: replace container content with the fragment content
        Fragment f = new HelloDynamicFragment();

        Bundle bundle = new Bundle();
        bundle.putString(NRLETTERSINTRO, "Textview length: ");
        bundle.putInt(NRLETTERS, textView.getText().toString().length());
        HelloDynamicFragment fragment = new HelloDynamicFragment();
        fragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.the_placeholder, f);
        // step 4: commit transaction
        fragmentTransaction.commit();
    }
}
