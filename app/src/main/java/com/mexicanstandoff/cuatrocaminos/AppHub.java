package com.mexicanstandoff.cuatrocaminos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AppHub extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_hub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_hub, menu);
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

    public void Run_Spotify(View view) {
        Context spotify_context = getApplicationContext();
        CharSequence text = "This button will launch the Spotify App";
        int duration = Toast.LENGTH_SHORT;

        Toast spotify_toast = Toast.makeText(spotify_context, text, duration);
        spotify_toast.show();
    }
    public void Run_Scores(View view) {
        Context scores_context = getApplicationContext();
        CharSequence text = "This button will launch the Run Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast scores_toast = Toast.makeText(scores_context, text, duration);
        scores_toast.show();

    }
    public void Run_Library(View view) {
        CharSequence text = "This button will launch the Run Library App";
        Toast run_library_toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        run_library_toast.show();

    }
    public void Run_Build_it(View view) {
        CharSequence text = "This button will launch the Build it bigger App";
        Toast build_it_toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        build_it_toast.show();
    }
    public void Run_xyz(View view) {
        CharSequence text = "This button will launch the Run XYZ App";
        Toast run_xyz_toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        run_xyz_toast.show();
    }
    public void Run_Capstone(View view) {
        CharSequence text = "This button will launch the Run Capstone App";
        Toast run_capstone_toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        run_capstone_toast.show();
    }

}
