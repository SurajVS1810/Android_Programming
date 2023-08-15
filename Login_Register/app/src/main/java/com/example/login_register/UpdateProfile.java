package com.example.login_register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateProfile extends AppCompatActivity {
    EditText e1,e2,e3;
    CDB db;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        Bundle b=getIntent().getExtras();
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        s1=b.getString("un");
        s2=b.getString("pw");
        db=new CDB(this);
    }
    public void onUpdate(View v){
        String op,np,cp;
        op=e1.getText().toString();
        np=e2.getText().toString();
        cp=e3.getText().toString();
        if(op.equals("")||np.equals("")||cp.equals("")){
            Toast.makeText(this, "Fill the requirements", Toast.LENGTH_LONG).show();
        }
        else{
            if(op.equals(s2)) {
                if(np.equals(cp)) {
                    db.update(np, s1);
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                }
                else{
                    Toast.makeText(this, "Password is not same", Toast.LENGTH_LONG).show();
                }
            }
            else{
                Toast.makeText(this, "Wromg Password", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void onBack(View v){
        Intent obj=new Intent("act_login");
        startActivity(obj);
    }

}