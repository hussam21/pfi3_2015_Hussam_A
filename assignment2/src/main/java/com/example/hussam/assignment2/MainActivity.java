package com.example.hussam.assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View Knapp=findViewById(R.id.click1);

        Knapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    Log.i("Click1", "Click");
            }
        });

        final View Knapp2=findViewById(R.id.click2);

        Knapp2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.i("Click2", "Click2");
            }
        });
        final View Knapp3=findViewById(R.id.click3);

        Knapp3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.i("Click3", "Click3");
            }
        });
        final View Knapp4=findViewById(R.id.click4);

        Knapp4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.i("Click4", "Click4");
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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



}
