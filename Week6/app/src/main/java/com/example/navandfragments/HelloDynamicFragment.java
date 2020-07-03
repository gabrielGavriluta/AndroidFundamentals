package com.example.navandfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloDynamicFragment extends Fragment {
    TextView textViewResult;
    public HelloDynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_hello_dynamic, container, false);
        textViewResult = view.findViewById(R.id.lengthTextview);
        Bundle bundle = getArguments();
        String textViewLength = bundle.getString(CreateFragment.NRLETTERSINTRO) + bundle.getInt(CreateFragment.NRLETTERS);
        textViewResult.setText("GOL");
        return view;
    }
}
