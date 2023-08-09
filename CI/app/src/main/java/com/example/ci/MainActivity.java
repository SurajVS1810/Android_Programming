package com.example.ci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
    }
    public void onCal(View v){
        double loan=Double.parseDouble(e1.getText().toString());
        int num=Integer.parseInt(e2.getText().toString());
        double interest=Double.parseDouble(e3.getText().toString());
        double amount = loan;
        for(int i=1;i<=num;i++){
            double amt=(amount*interest)/100;
              amount=amount+amt;
        }
        String str=String.valueOf(amount);
        e4.setText("CI :"+str);
    }
}