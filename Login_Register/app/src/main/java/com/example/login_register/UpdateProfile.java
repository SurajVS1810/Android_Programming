package com.example.login_register;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateProfile extends AppCompatActivity {

    CDB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        db=new CDB(this);
    }
    public void onUpdate(View v){
        
    }

}