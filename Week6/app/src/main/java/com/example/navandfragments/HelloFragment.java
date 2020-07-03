package com.example.navandfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment {
    private TextView textViewResult;
    public HelloFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_hello, container, false);
        textViewResult = view.findViewById(R.id.lengthTextview);
        Bundle bundle = getArguments();
        if(bundle != null) {
            String textViewLength = bundle.getString(CreateFragment.NRLETTERSINTRO) + bundle.getInt(CreateFragment.NRLETTERS);
            textViewResult.setText(textViewLength);
        }
        else{
            textViewResult.setText("GOL");
        }
        return view;
    }
}
