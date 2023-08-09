package com.example.maxmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitythird);
        Bundle b=getIntent().getExtras();
        s=b.getString("max");
        EditText ed1=(EditText)findViewById(R.id.ed1);
        ed1.setText("MAX = "+s);
    }

}