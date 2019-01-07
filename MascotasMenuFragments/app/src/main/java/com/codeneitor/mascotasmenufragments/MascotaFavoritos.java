package com.codeneitor.mascotasmenufragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.codeneitor.mascotasmenufragments.adapter.MascotaAdaptador;
import com.codeneitor.mascotasmenufragments.pojo.Mascota;

import java.util.ArrayList;

public class MascotaFavoritos extends AppCompatActivity {

    ArrayList<Mascota> mascotas ;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos_mascota);
        //Agregamos nuestro ToolBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        //Agregamos soporte al botón de navegación hacia atrás
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Agregamos la huella en nuestro Toolbar
        getSupportActionBar().setIcon(R.drawable.huella);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        GridLayoutManager glm = new GridLayoutManager(this, 3);

        listaMascotas.setLayoutManager(glm);

        iniciarListaContactos();
        iniciarAdaptador();

    }

    public MascotaAdaptador adaptador;
    public void iniciarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        //MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaContactos(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.huella,"Huella",200));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Hueso",145));
        mascotas.add(new Mascota(R.drawable.huella,"huella",124));
        mascotas.add(new Mascota(R.drawable.hotel,"Favoritos",298));
        mascotas.add(new Mascota(R.drawable.huella,"Huella",234));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_favoritos, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mAbout:
                Intent about = new Intent(MascotaFavoritos.this, AboutActivity.class);
                startActivity(about);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
