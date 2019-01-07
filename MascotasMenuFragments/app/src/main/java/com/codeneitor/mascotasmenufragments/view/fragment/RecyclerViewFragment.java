package com.codeneitor.mascotasmenufragments.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeneitor.mascotasmenufragments.R;
import com.codeneitor.mascotasmenufragments.adapter.MascotaAdaptador;
import com.codeneitor.mascotasmenufragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by b41n on 6/01/19.
 */

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas ;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);

        //LinearLayoutManager llm = new LinearLayoutManager(this);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);

        //llm.setOrientation(LinearLayoutManager.VERTICAL);

        //listaMascotas.setLayoutManager(llm);
        listaMascotas.setLayoutManager(glm);

        iniciarListaContactos();
        iniciarAdaptador();
        //Log.i("ERROR","ADAPTADAOR INICIALIZADO");

        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    public MascotaAdaptador adaptador;
    public void iniciarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        //MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
    }
}
