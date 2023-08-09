package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v){
        EditText e1,e2,e3;
        e1= (EditText) findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
        String s1= e1.getText().toString();
        String s2=e2.getText().toString();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n3=n1+n2;
        String s3=String.valueOf(n3);
        e3.setText(s3);
    }
    public void Subtract(View v){
        EditText e1,e2,e3;
        e1= (EditText) findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
        String s1= e1.getText().toString();
        String s2=e2.getText().toString();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int n3=n1-n2;
        String s3=String.valueOf(n3);
        e3.setText(s3);
    }

}