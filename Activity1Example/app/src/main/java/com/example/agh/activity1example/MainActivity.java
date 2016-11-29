package com.example.agh.activity1example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("agh.activity1example", "uruchomiono onCreate()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("agh.activity1example", "uruchomiono onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("agh.activity1example", "uruchomiono onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("agh.activity1example", "uruchomiono onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("agh.activity1example", "uruchomiono onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("agh.activity1example", "uruchomiono onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("agh.activity1example", "uruchomiono onStop()");
    }

}