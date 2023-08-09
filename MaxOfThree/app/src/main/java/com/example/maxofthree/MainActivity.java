package com.example.maxofthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);

    }
    public void onMax(View v){
        int i=Integer.parseInt(e1.getText().toString());
        int j=Integer.parseInt(e2.getText().toString());
        int k=Integer.parseInt(e3.getText().toString());
        int a=i>j?i:j;
        a=a>k?a:k;
        String s=String.valueOf(a);
        e4.setText("Max : "+s);
    }
    public void onMin(View v){
        int i=Integer.parseInt(e1.getText().toString());
        int j=Integer.parseInt(e2.getText().toString());
        int k=Integer.parseInt(e3.getText().toString());
        int a=i<j?i:j;
        a=a<k?a:k;
        String s=String.valueOf(a);
        e4.setText("Min : "+s);
    }
}