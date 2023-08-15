package com.example.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    TextView t;
    CDB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        db=new CDB(this);
        t=(TextView)findViewById(R.id.t1);
        Bundle b=getIntent().getExtras();
        String s1=b.getString("name");
        t.setText("Welcome "+s1);
    }
    public void onEdit(View v){
        Intent obj=new Intent("act_update");
        startActivity(obj);
    }
    public void onSignout(View v){

    }

}