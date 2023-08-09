package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    CheckBox c1,c2,c3;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        e1=(EditText)findViewById(R.id.e1);
    }
    public void onSslc(View v){
        if(c1.isChecked()) {
            s = "SSLC";
            e1.setText(s);
        }
        else{
            c1.setChecked(false);
            c2.setChecked(false);

            c3.setChecked(false);
            s = "";
            e1.setText(s);
        }
    }
    public void onPlus(View v){
        if(c2.isChecked()) {
            c1.setChecked(true);
            s = "SSLC Plustwo";
            e1.setText(s);
        }
        else{
            s="SSLC";
            e1.setText(s);
            c1.setChecked(true);
            c3.setChecked(false);
        }
    }
    public void onDegree(View v){
        if(c3.isChecked()) {
            c1.setChecked(true);
            c2.setChecked(true);
            s="SSLC Plustwo Degree";
            e1.setText(s);
        }
        else{
            s="SSLC Plustwo";
            e1.setText(s);
        }
    }
}