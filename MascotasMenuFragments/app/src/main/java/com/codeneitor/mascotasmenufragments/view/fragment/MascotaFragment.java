package com.codeneitor.mascotasmenufragments.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeneitor.mascotasmenufragments.R;

/**
 * Created by b41n on 6/01/19.
 */

public class MascotaFragment extends Fragment {
    public MascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mascota, container, false);
        //return inflater.inflate(R.layout.fragment_mascota, container, false);
        return view;
    }

}
