package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu,m);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem m)
    {
        switch(m.getItemId())
        {
            case R.id.ID_MENU_NEW:
                Toast.makeText(getApplicationContext(),"New is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.ID_MENU_OPEN:
                Toast.makeText(getApplicationContext(),"Open is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.ID_MENU_EXIT:
                finish();
                break;
        }
        return true;
    }

}