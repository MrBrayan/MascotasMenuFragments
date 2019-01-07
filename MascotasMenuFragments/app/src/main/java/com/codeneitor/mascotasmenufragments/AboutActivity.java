package com.codeneitor.mascotasmenufragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by b41n on 6/01/19.
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
