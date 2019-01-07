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
