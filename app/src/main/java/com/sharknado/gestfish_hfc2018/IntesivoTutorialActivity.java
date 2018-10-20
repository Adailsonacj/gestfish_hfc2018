package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class IntesivoTutorialActivity extends AppCompatActivity {

    ListView listaCursos;
    List<String> cursos;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intesivo_tutorial);
        cursos = new ArrayList<String>();

        listaCursos = findViewById(R.id.intensivoTutorial);
        cursos.add("Montagem de Tanque Rede Passo a Passo");
        cursos.add("Despescagem Tanque Elevado");
        cursos.add("Sistema de Reutilização de agua Tanque Elevado");
        cursos.add("Sistema de Oxigenadores Caseiro");

        adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,cursos);

        listaCursos.setAdapter(adapter);

    }
}
