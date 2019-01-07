package com.codeneitor.mascotasmenufragments.view.fragment;

import com.codeneitor.mascotasmenufragments.adapter.MascotaAdaptador;
import com.codeneitor.mascotasmenufragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by b41n on 6/01/19.
 */

public interface IRecyclerViewFragmentView {
    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
