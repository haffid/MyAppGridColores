package com.haffid.myappgridcolores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorGrid extends BaseAdapter {

    private Context context;
    private  int referencia;
    private ArrayList<String> nombreColores = new ArrayList<>();
    private ArrayList<Integer> colores = new ArrayList<>();

    public AdaptadorGrid(Context context, int referencia, ArrayList<String> nombreColores, ArrayList<Integer> colores) {
        this.context = context;
        this.referencia = referencia;
        this.nombreColores = nombreColores;
        this.colores = colores;
    }

    @Override
    public int getCount() {
        return this.nombreColores.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.grid_personalizado, null);
        String nom;
        nom = this.nombreColores.get(position);
        int img;
        img = this.colores.get(position);
        TextView campoNombre;
        ImageView campoImagen;
        campoNombre = v.findViewById(R.id.txtGrid);
        campoImagen = v.findViewById(R.id.imgGrid);
        campoNombre.setText(String.valueOf(nom));
        campoImagen.setImageResource(img);

        return v;
    }
}
