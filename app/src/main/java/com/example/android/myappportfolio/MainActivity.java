package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View view) {
        int id = view.getId();
        Toast toast;
        switch (id) {
            case R.id.app1 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch SPOTIFY STREAMER app!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.app2 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch SCORES app!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.app3 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch LIBRARY app!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.app4 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch BUILD IT BIGGER app!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.app5 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch BACON READER app!",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.app6 :
                toast = Toast.makeText(getApplicationContext(),"This button will launch MY APP!",Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
