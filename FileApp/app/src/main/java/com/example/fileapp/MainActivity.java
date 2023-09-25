package com.example.fileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSave(View v){
        try{
            EditText e1=(EditText)findViewById(R.id.ed1);
            EditText e2=(EditText)findViewById(R.id.ed2);
            FileOutputStream fout;
            fout=openFileOutput(e1.getText().toString(),0);
            OutputStreamWriter osw=new OutputStreamWriter(fout);
            osw.write(e2.getText().toString());
            osw.flush();
            osw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void onOpen(View v){
        try{
            EditText e1=(EditText)findViewById(R.id.ed1);
            EditText e2=(EditText)findViewById(R.id.ed2);
            FileInputStream fin;
            fin=openFileInput(e1.getText().toString());
            InputStreamReader isw=new InputStreamReader(fin);
            int l=(int)fin.available();
            char[] b=new char[l];
            int n=isw.read(b,0,l);
            String str=new String(b,0,n);
            e2.setText(str);
            isw.close();


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}