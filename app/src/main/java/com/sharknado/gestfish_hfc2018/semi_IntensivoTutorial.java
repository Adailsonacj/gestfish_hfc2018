package com.sharknado.gestfish_hfc2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class semi_IntensivoTutorial extends AppCompatActivity {

    ListView listaCursos;
    List<String> cursos;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi__intensivo_tutorial);

        listaCursos = findViewById(R.id.semi_intensivoCursosLista);

        cursos = new ArrayList<String>();
        cursos.add("Tanque Escavado e suas dimesoes");
        cursos.add("Novas Rações no Mercado");
        cursos.add("Despesca em tanques Escavados");
        cursos.add("Monitoramento do Oxigenio na Agua");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,cursos);


        listaCursos.setAdapter(adapter);


    }
}
