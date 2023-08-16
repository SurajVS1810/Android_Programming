package com.example.json2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView) findViewById(R.id.textView);
        String strJson="{ \"Employee\" : [{\"id\":\"101\",\"name\":\"Sonu Jaiswal\",\"salary\":\"50000\"},{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"salary\":\"60000\"}]}";

        String data = "";
        try {
            JSONObject jsonRootObject=new JSONObject(strJson);
            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");

            for(int i=0;i<jsonArray.length();i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id=Integer.parseInt(jsonObject.optString("id"));
                String name=jsonObject.getString("name");
                float salary = Float.parseFloat(jsonObject.optString("salary"));

                data+="Node"+(i+1)+": \n id= "+id+"\n name= "+name+"\n salary= "+salary+"\n";

                tv.setText(data);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}