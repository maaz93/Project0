package com.udacity.android.maaz.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String SPOTIFY = "Spotify Streamer";
    private static String SUPER_DUO = "Super Duo";
    private static String BUILD_BIGGER = "Build It Bigger";
    private static String XYZ = "XYZ Reader";
    private static String CAPSTONE = "Capstone";
    private static String UNKNOWN = "Unknown";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    @Override
    public void onClick(View v) {
        String appName = null;

        switch (v.getId()) {

            case R.id.spotifyButton:
                appName = SPOTIFY;
                break;

            case R.id.biggerButton:
                appName = BUILD_BIGGER;
                break;

            case R.id.xyzButton:
                appName = XYZ;
                break;

            case R.id.scoresButton:
            case R.id.libraryButton:
                appName = SUPER_DUO;
                break;

            case R.id.capstoneButton:
                appName = CAPSTONE;
                break;

            default:
                appName = UNKNOWN;
        }

        String toastString = "This button will launch my " + appName + " app!";
        Toast.makeText(MainActivity.this, toastString, Toast.LENGTH_SHORT).show();
    }
}
