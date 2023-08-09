package com.example.maxmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthactivity);
        Bundle b=getIntent().getExtras();
        s=b.getString("min");
        EditText ed1=(EditText)findViewById(R.id.ed1);
        ed1.setText("MIN = "+s);
    }

}