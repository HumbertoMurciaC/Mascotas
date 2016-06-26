package com.example.humbertomariom.petagram;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView Lista_mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar2);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Lista_mascotas = (RecyclerView) findViewById(R.id.rv_Mascotas2);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        Lista_mascotas.setLayoutManager(llm);

        InicializarListaMacotas();
        InicializarMascotaAdaptador();


    }


    public void InicializarMascotaAdaptador(){
        Mascota_Adaptador adaptador = new Mascota_Adaptador(mascotas);
        Lista_mascotas.setAdapter(adaptador);
    }

    public void InicializarListaMacotas(){

        mascotas = new ArrayList<Mascota>();


        mascotas.add(new Mascota("Simon",R.drawable.perro2,5));
        mascotas.add(new Mascota("Lucas",R.drawable.perro4,4));
        mascotas.add(new Mascota("Ronny",R.drawable.perro5,3));
        mascotas.add(new Mascota("Tonny",R.drawable.perro1,0));
        mascotas.add(new Mascota("Matty",R.drawable.perro3,0));



    }

}
