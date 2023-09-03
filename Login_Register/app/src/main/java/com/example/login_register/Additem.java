package com.example.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Additem extends AppCompatActivity {
    TextView t6,t7,t8;
    CDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buger);
        db=new CDB(this);
        t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7);
        t8=(TextView)findViewById(R.id.t8);

    }
    public void AddCart(View v){

    }

    public void Add(View v){
        String s3= t7.getText().toString();
        int i=Integer.parseInt(s3);
        i++;
        String str=String.valueOf(i);
        t7.setText(str);
        String s2= t6.getText().toString();
        int n2=Integer.parseInt(s2);
        int n=i*n2;
        String tp=String.valueOf(n);
        t8.setText(tp);
    }

    public void Minus(View v){
        String s4= t7.getText().toString();
        int i=Integer.parseInt(s4);
        if(i!=0) {
            i--;
            String str = String.valueOf(i);
            t7.setText(str);
            String s2= t6.getText().toString();
            int n2=Integer.parseInt(s2);
            int n=i*n2;
            String tp=String.valueOf(n);
            t8.setText(tp);
        }
    }
}