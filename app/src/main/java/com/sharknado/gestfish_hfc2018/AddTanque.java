package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddTanque extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spTipo;
    private Spinner spTipoProducao;
    private Spinner spEspecie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tanque);

        spTipo = findViewById(R.id.spTipo);
        List<String> listTipo = new ArrayList<>();
        listTipo.add("Tanque-Escavado");
        listTipo.add("Tanque-Rede");
        listTipo.add("Tanque-Escavado");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listTipo);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipo.setAdapter(arrayAdapter);
        //spTipo.setOnItemSelectedListener(this);
        spTipoProducao = findViewById(R.id.spTipoProducao);
        List<String> listTipoProducao = new ArrayList<>();
        listTipoProducao.add("Intensivo");
        listTipoProducao.add("Semi-Intensivo");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listTipoProducao);
        spTipoProducao.setAdapter(arrayAdapter1);
        spEspecie = findViewById(R.id.spEspecie);
        List<String> especie = new ArrayList<>();
        especie.add("Tilápia");
        especie.add("Tambaqui");
        especie.add("Pacu");
        especie.add("Tambacu");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, especie);
        spEspecie.setAdapter(arrayAdapter2);
    }

    public void addTanque(View view) {
        Intent vrintention = new Intent(this, Tanques.class);
        startActivity(vrintention);
        finish();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
