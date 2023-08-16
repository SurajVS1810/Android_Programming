package com.example.json1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    public static final String JSON_STRING="{\"employee\":{\"name\":\"Sachin\",\"Salary\":56000}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.textView2);
        try{
            JSONObject emp=(new JSONObject(JSON_STRING).getJSONObject("employee"));
            String empname=emp.getString("name");
            int empsalary=emp.getInt("salary");
            String str="Employee Name: "+empname+"\nEmployee Salary: "+empsalary;
            tv.setText(str);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}