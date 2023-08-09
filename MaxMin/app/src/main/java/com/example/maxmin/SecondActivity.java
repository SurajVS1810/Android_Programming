package com.example.maxmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    String s1,s2,s3;
    Integer n1,n2,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);
        Bundle b=getIntent().getExtras();
        String s1=b.getString("e1");
        String s2=b.getString("e2");
        String s3=b.getString("e3");
    }
    public void onMax(View v){
        Intent obj=new Intent("actthird");
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        n3=Integer.parseInt(s3);
        Integer m=(n1>n2)?n1:n2;
        Integer  max=(m>n3)?m:n3;
        String s=max.toString();
        obj.putExtra("max",s);
        startActivity(obj);
    }
    public void onMin(View v){
        Intent obj=new Intent("actfourth");
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        n3=Integer.parseInt(s3);
        Integer m=(n1<n2)?n1:n2;
        Integer  max=(m<n3)?m:n3;
        String s=max.toString();
        obj.putExtra("min",s);
        startActivity(obj);
    }
}