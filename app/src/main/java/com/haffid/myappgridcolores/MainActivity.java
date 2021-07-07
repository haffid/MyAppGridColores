package com.haffid.myappgridcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    ArrayList<String> nombreColores = new ArrayList<>();
    ArrayList<Integer> colores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridColores);

        nombreColores.add("Verde #0EFA2D");
        nombreColores.add("Azul #0028FB");
        nombreColores.add("Blanco #FFFFFF");
        nombreColores.add("Negro #000000");
        nombreColores.add("Rojo #FE2C14");
        nombreColores.add("Naranja #FF8000");
        nombreColores.add("Amarillo #FFFF00");
        nombreColores.add("Gris #777777");
        nombreColores.add("Rosado #FFBFFF");
        nombreColores.add("Purpura #6D00D9");
        nombreColores.add("Celeste #4DD2FF");
        nombreColores.add("Turquesa #3FBFBF");
        nombreColores.add("Dorado #BF9F40");
        nombreColores.add("Cian #06FCFE");
        nombreColores.add("Magenta #FE3DFC");

        colores.add(R.drawable.ic_verde);
        colores.add(R.drawable.ic_azul);
        colores.add(R.drawable.ic_blanco);
        colores.add(R.drawable.ic_negro);
        colores.add(R.drawable.ic_rojo);
        colores.add(R.drawable.ic_naranja);
        colores.add(R.drawable.ic_amarillo);
        colores.add(R.drawable.ic_gris);
        colores.add(R.drawable.ic_rosado);
        colores.add(R.drawable.ic_purpura);
        colores.add(R.drawable.ic_celeste);
        colores.add(R.drawable.ic_turquesa);
        colores.add(R.drawable.ic_dorado);
        colores.add(R.drawable.ic_cian);
        colores.add(R.drawable.ic_magenta);

        /*ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nombreColores);
        gridView.setAdapter(adapter);*/

        AdaptadorGrid adaptadorGrid = new AdaptadorGrid(this, R.layout.grid_personalizado, nombreColores, colores);
        gridView.setAdapter(adaptadorGrid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "A pulsado " +nombreColores.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MAMostrar.class);
                intent.putExtra("nombrecolores", nombreColores.get(position));
                intent.putExtra("colores", colores.get(position));
                startActivity(intent);
            }
        });


    }
}