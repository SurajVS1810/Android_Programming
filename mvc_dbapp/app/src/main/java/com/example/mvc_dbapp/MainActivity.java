package com.example.mvc_dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText e2,e3;
    CDB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e2=(EditText)findViewById(R.id.e1);
        e3=(EditText)findViewById(R.id.e2);
        db=new CDB(this);
    }
    public void OnSave(View v){
        CDept rec=new CDept();
        rec.dname=e2.getText().toString();
        rec.dloc=e3.getText().toString();
        db.addDept(rec);
        e2.setText("");
        e3.setText("");
    }
    public void OnList(View v){
        List<CDept> rec=db.getAllvalues();
        String str="";
        for(CDept cr:rec){
            String log="Did: "+cr.id+", Dname: "+cr.dname+" ,DLOC: "+cr.dloc;
            log=log+"\n";
            str=str+log;
        }
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText(str);
    }
}