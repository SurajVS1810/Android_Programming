package com.example.resultact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText e1;
    Integer num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Bundle b=getIntent().getExtras();
        String s1=b.getString("e1");
        String s2=b.getString("e2");
        Integer num1=Integer.parseInt(s1);
        Integer num2=Integer.parseInt(s2);
        num3=num1+num2;
        e1=(EditText)findViewById(R.id.ed1);
        e1.setText(num1+"+"+num2);
//        Intent res = new Intent();
//        res.setData(Uri.parse("" + num3));
//        setResult(RESULT_OK,res);
//        finish();
    }
    public void Show(View v){
        Intent res = new Intent();
        res.setData(Uri.parse("" + num3));
        setResult(RESULT_OK,res);
//        finish();
        finish();
    }
}