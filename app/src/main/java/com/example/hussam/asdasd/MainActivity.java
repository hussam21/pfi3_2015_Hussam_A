package com.example.hussam.asdasd;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    public int next = 0;
    public Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Testing", "onCreate");
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

    public void click(View v){
        Log.i("myApp", "ButtonClicked");


        String[] myQuotes = getResources().getStringArray(R.array.myQuotes);
        TextView myText = (TextView) findViewById(R.id.textView2);
        next=r.nextInt(myQuotes.length);

        myText.setText(myQuotes[next]);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Testing", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Testing", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Testing", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Testing", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Testing", "onDestroy");
    }
}
