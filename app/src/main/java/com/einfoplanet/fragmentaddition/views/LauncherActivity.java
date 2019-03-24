package com.einfoplanet.fragmentaddition.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.einfoplanet.fragmentaddition.R;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void launchTask1(View view) {
        startActivity(new Intent(this,ListActivity.class));
    }

    public void launchTask2(View view) {
        startActivity(new Intent(this,ThreeFragmentActivity.class));
    }
}
