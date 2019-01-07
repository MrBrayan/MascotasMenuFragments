package com.codeneitor.mascotasmenufragments;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MascotaDetalle extends AppCompatActivity {

    ImageView imvMascota;

    TextView tvMascotaNombre;
    TextView tvMascotaLikes;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_mascota);
        //Agregamos nuestro ToolBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        //Agregamos soporte al botón de navegación hacia atrás
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // se elimina
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Bundle parametros = getIntent().getExtras();
        int foto = parametros.getInt(getResources().getString(R.string.pfoto));
        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String likes = parametros.getString(getResources().getString(R.string.plikes));

        imvMascota = (ImageView) findViewById(R.id.imvMascota);
        tvMascotaNombre = (TextView) findViewById(R.id.tvMascotaNombre);
        tvMascotaLikes = (TextView) findViewById(R.id.tvMascotaLikes);


        imvMascota.setImageResource(foto);
        Log.i("FOTO",""+foto);
        tvMascotaNombre.setText(nombre);
        Log.i("NOMBRE",""+nombre);
        tvMascotaLikes.setText(likes);
        Log.i("LIKES",""+likes);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(MascotaDetalle.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_mascota, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.mDelMascota:
                try {
                    Toast.makeText(this, R.string.mDelete, Toast.LENGTH_LONG).show();
                } catch (Resources.NotFoundException e) {
                    Log.i("EROOR",getResources().getString(R.string.error011));
                }
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
