package com.example.hussam.assignment3.skaneAPI.view;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import   com.example.hussam.assignment3.skaneAPI.R; //se.mah.k3.skaneAPI.R;
import com.example.hussam.assignment3.skaneAPI.control.Constants;//se.mah.k3.skaneAPI.control.Constants;
import com.example.hussam.assignment3.skaneAPI.model.Journey; //se.mah.k3.skaneAPI.model.Journey;
import  com.example.hussam.assignment3.skaneAPI.model.Journeys;//se.mah.k3.skaneAPI.model.Journeys;
import  com.example.hussam.assignment3.skaneAPI.xmlparser.Parser; //se.mah.k3.skaneAPI.xmlparser.Parser;

public class TestActivity extends Activity {
    private  ArrayList<Journey> journeyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_reseplaneraren);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Reseplaneraren bf = new Reseplaneraren();

        ft.replace(R.id.id, bf);
        ft.commit();

        journeyList = new ArrayList<Journey>();
        View v = findViewById(R.id.btn_search);
        v. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner sp = (Spinner)findViewById(R.id.spinner2);
                int i = sp.getSelectedItemPosition();
                String[] sa = getResources().getStringArray(R.array.Number);
                String sb = sa[i];

                Spinner sp2 = (Spinner)findViewById(R.id.spinner3);
                int i2 = sp2.getSelectedItemPosition();
                String[] sa2 = getResources().getStringArray(R.array.Number);
                String sb2 = sa2[i2];

                String searchURL = Constants.getURL(sb, sb2, 10); //Malmö C = 80000,  Malmö GAtorg 80100, Hässleholm C 93070
                new DoInBackground().execute(searchURL);
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void searchFinished(){
        TextView tw = (TextView)findViewById(R.id.textView_test);
        tw.setText("");
        for (Journey j: journeyList){
            tw.append("From"+ j.getStartStation().getStationName()
                    +" To: "+ j.getEndStation()
                    + " leaves : "+j.getTimeToDeparture()+ "\n");

        }
    }

//This is a AsyncTask Thread built for Android
    private class DoInBackground extends AsyncTask<String,Void,Long> {
        @Override
        protected Long doInBackground(String... params) {
             //Search
            Journeys journeys = Parser.getJourneys(params[0]); //There can be many in the params Array
            //And put the Journeys in our list.
            journeyList.clear();
            journeyList.addAll(journeys.getJourneys());
            return null;
        }

        @Override
        protected void onPostExecute(Long result) { //Called when the AsyncTask is all done
            searchFinished();
        }
    }
}
