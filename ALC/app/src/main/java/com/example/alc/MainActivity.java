package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyApp","OnCreate()");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("MyApp","OnStart()");

    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("MyApp","OnStop()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("MyApp","OnPause()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("MyApp","OnResume()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyApp","OnDestroy()");
    }
}