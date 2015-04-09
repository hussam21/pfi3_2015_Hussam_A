package com.example.hussam.assignment2;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements  View.OnClickListener {


    public BlankFragment() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.activity_main, container, false);
        View myButtonView = v.findViewById(R.id.click1);
        myButtonView.setOnClickListener(this);
        return v;

    }





    @Override
    public void onClick(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        BlankFragment2 bf = new BlankFragment2();
        ft.replace(R.id.Start1,bf);
        ft.commit();
        Toast.makeText(getActivity(), "Reseplanerare",Toast.LENGTH_SHORT);

    }
}
