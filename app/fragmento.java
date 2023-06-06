package com.example.sprint;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class YourFragment extends Fragment {

    public YourFragment() {
        // Constructor vacío requerido
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflar el diseño del fragmento aquí
        View rootView = inflater.inflate(R.layout.fragmento, container, false);
        // Realizar cualquier otra configuración del fragmento si es necesario
        return rootView;
    }
}
