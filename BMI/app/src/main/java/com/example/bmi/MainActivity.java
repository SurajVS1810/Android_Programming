package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
    }
    public void onCal(View v){
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        float h,w,i;
        h=Integer.parseInt(s1);
        h=h/100;
        w=Integer.parseInt(s2);
        i=w/(h*h);
        String s3=String.valueOf(i);
        if(s1==""||s1.length()==0||s2==""||s2.length()==0){
            {
                Toast.makeText(getApplicationContext(), "Enter values", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            e3.setText("BMI : "+s3+" kg/m²");
            e1.setText("");
            e2.setText("");
            e3.requestFocus();
        }
        if(i<18.5){
            Toast.makeText(getApplicationContext(), "You are underweight", Toast.LENGTH_SHORT).show();
        }
        else if(i>=18.5&&i<24.9){
            Toast.makeText(getApplicationContext(), "You are Fit", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "You are Overweight", Toast.LENGTH_SHORT).show();
        }
    }
}