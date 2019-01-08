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
        //Agregamos nuestro ToolBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        //Agregamos soporte al botón de navegación hacia atrás
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Agregamos la huella en nuestro Toolbar
        getSupportActionBar().setIcon(R.drawable.huella_perro);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
