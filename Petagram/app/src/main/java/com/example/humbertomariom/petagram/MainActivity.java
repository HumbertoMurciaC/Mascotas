package com.example.humbertomariom.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView Lista_mascotas;
    ImageView estrella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.MiActionBar);
        setSupportActionBar(miActionBar);

        estrella = (ImageView) findViewById(R.id.favorites);
        Lista_mascotas = (RecyclerView) findViewById(R.id.rv_Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        Lista_mascotas.setLayoutManager(llm);

        InicializarListaMacotas();
        InicializarMascotaAdaptador();

        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity2.class);
                startActivity(intent);

            }
        });


    }

    public void InicializarMascotaAdaptador(){
        Mascota_Adaptador adaptador = new Mascota_Adaptador(mascotas);
        Lista_mascotas.setAdapter(adaptador);
    }


    public void InicializarListaMacotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Tonny",R.drawable.perro1,0));
        mascotas.add(new Mascota("Simon",R.drawable.perro2,5));
        mascotas.add(new Mascota("Matty",R.drawable.perro3,0));
        mascotas.add(new Mascota("Lucas",R.drawable.perro4,4));
        mascotas.add(new Mascota("Ronny",R.drawable.perro5,3));

    }

}
