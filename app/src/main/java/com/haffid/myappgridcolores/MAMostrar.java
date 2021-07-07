package com.haffid.myappgridcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MAMostrar extends AppCompatActivity {
    TextView col;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamostrar);

        col = findViewById(R.id.txtMostrar);
        img = findViewById(R.id.imgMostrar);

        this.dato();
    }
    private void dato(){
    Bundle bundle = getIntent().getExtras();
    String color = bundle.getString("nombrecolores");
    int imagen = bundle.getInt("colores");

    this.col.setText(color);
    this.img.setImageResource(imagen);
    }
}