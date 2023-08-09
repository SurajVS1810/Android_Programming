package com.example.maxmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCal(View v){
        Intent obj=new Intent("act_sec");
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        e3=(EditText)findViewById(R.id.ed3);
        obj.putExtra("e1",e1.getText().toString());
        obj.putExtra("e2",e2.getText().toString());
        obj.putExtra("e3",e3.getText().toString());
        startActivity(obj);
    }
}