package com.codeneitor.mascotasmenufragments.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
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

        listaMascotas = view.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        iniciarAdaptador();

        return view;
    }

    public MascotaAdaptador adaptador;
    public void iniciarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.garfield,"Garfield",123));
        mascotas.add(new Mascota(R.drawable.oddie,"Oddie",145));
        mascotas.add(new Mascota(R.drawable.gyo2,"Garfield y Oddie",145));
        mascotas.add(new Mascota(R.drawable.gyo,"Garfield y Oddie",875));
        mascotas.add(new Mascota(R.drawable.huella_perro,"Dog",564));
        mascotas.add(new Mascota(R.drawable.bone_white,"Bone",546));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",767));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",275));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",876));
        mascotas.add(new Mascota(R.drawable.garfield,"Garfield",945));
        mascotas.add(new Mascota(R.drawable.oddie,"Oddie",345));
        mascotas.add(new Mascota(R.drawable.gyo2,"Garfield y Oddie",635));
        mascotas.add(new Mascota(R.drawable.gyo,"Garfield y Oddie",150));
        mascotas.add(new Mascota(R.drawable.huella_perro,"Dog",134));
        mascotas.add(new Mascota(R.drawable.bone_white,"Bone",150));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",134));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.garfield,"Garfield",134));
        mascotas.add(new Mascota(R.drawable.oddie,"Oddie",150));
        mascotas.add(new Mascota(R.drawable.gyo2,"Garfield y Oddie",134));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.gyo,"Garfield y Oddie",150));
        mascotas.add(new Mascota(R.drawable.huella_perro,"Dog",134));
        mascotas.add(new Mascota(R.drawable.bone_white,"Bone",150));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",134));
        mascotas.add(new Mascota(R.drawable.hotel,"Star",134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",150));
        mascotas.add(new Mascota(R.drawable.garfield,"Garfield",134));
        mascotas.add(new Mascota(R.drawable.oddie,"Oddie",150));
        mascotas.add(new Mascota(R.drawable.gyo2,"Garfield y Oddie",134));
        mascotas.add(new Mascota(R.drawable.gyo,"Garfield y Oddie",150));
        mascotas.add(new Mascota(R.drawable.huella_perro,"Dog",134));
        mascotas.add(new Mascota(R.drawable.bone_white,"Bone",150));
        mascotas.add(new Mascota(R.drawable.bone_yellow,"Bone",134));

    }
}
