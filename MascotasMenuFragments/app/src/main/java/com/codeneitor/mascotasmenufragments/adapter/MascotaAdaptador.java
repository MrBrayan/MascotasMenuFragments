package com.codeneitor.mascotasmenufragments.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codeneitor.mascotasmenufragments.MascotaDetalle;
import com.codeneitor.mascotasmenufragments.R;
import com.codeneitor.mascotasmenufragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by b41n on 6/01/19.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imvMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvMascotaNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvMascotaLikes.setText(String.valueOf(mascota.getLikes()));

        mascotaViewHolder.imvMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, MascotaDetalle.class);
                intent.putExtra(activity.getResources().getString(R.string.pfoto), mascota.getFoto());
                intent.putExtra(activity.getResources().getString(R.string.pnombre), mascota.getNombre());
                intent.putExtra(activity.getResources().getString(R.string.plikes), mascota.getLikes());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imvMascota;
        private TextView tvMascotaNombre;
        private TextView tvMascotaLikes;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imvMascota = (ImageView) itemView.findViewById(R.id.imvMascota);
            tvMascotaNombre = (TextView) itemView.findViewById(R.id.tvMascotaNombre);
            tvMascotaLikes =(TextView) itemView.findViewById(R.id.tvMascotaLikes);
        }
    }
}
