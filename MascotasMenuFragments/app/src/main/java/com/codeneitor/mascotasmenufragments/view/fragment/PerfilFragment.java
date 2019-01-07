package com.codeneitor.mascotasmenufragments.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeneitor.mascotasmenufragments.R;
import com.codeneitor.mascotasmenufragments.adapter.MascotaAdaptador;
import com.codeneitor.mascotasmenufragments.adapter.PerfilAdapter;
import com.codeneitor.mascotasmenufragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by b41n on 6/01/19.
 */

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas ;
    private RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        //return inflater.inflate(R.layout.fragment_perfil, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);

        listaMascotas.setLayoutManager(glm);

        iniciarListaMascotas();
        iniciarAdaptador();
        //Log.i("ERROR","ADAPTADAOR INICIALIZADO");
        return view;
    }


    public PerfilAdapter adaptador;
    public void iniciarAdaptador(){
        adaptador = new PerfilAdapter(mascotas, getActivity());
        //MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.hotel,134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,150));
        mascotas.add(new Mascota(R.drawable.hotel,134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,150));
        mascotas.add(new Mascota(R.drawable.hotel,134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,150));
        mascotas.add(new Mascota(R.drawable.hotel,134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,150));
        mascotas.add(new Mascota(R.drawable.hotel,134));
        mascotas.add(new Mascota(R.drawable.bone_yellow,150));
    }


}
