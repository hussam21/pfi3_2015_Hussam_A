package com.example.hussam.assignment4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


/**
 * A simple {@link Fragment} subclass.
 */

public class Solarsystem1 extends Fragment implements AdapterView.OnItemSelectedListener {


    public Solarsystem1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


    View v = inflater.inflate(R.layout.fragment_solarsystem1, container, false);

            return v;

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}
