package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.sharknado.gestfish_hfc2018.dao.EspecieDao;
import com.sharknado.gestfish_hfc2018.dao.TanqueDao;
import com.sharknado.gestfish_hfc2018.model.Especie;
import com.sharknado.gestfish_hfc2018.model.TanqueModel;

import java.util.ArrayList;
import java.util.List;

public class AddTanque extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spTipo;
    private Spinner spEspecie;
    private EditText tamanho;
    private EditText quantidade;
    private TextView twDica;
    private List<String> listTipo = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    TanqueDao td = new TanqueDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tanque);

        spTipo = findViewById(R.id.spTipo);
        tamanho = findViewById(R.id.editTamanho);
        quantidade = findViewById(R.id.editQtd);

        listTipo.add("Tanque-Escavado");
        listTipo.add("Tanque-Rede");
        listTipo.add("Tanque-Elevado");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listTipo);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spTipo.setAdapter(arrayAdapter);
        twDica = findViewById(R.id.twDica);

        EspecieDao es = new EspecieDao();
        spEspecie = findViewById(R.id.spEspecie);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, es.getBase());
        spEspecie.setAdapter(arrayAdapter2);
        spTipo.setOnItemSelectedListener(this);
    }


    public void addTanque(View view) {
        if (!tamanho.getText().toString().equals("")&&!quantidade.getText().toString().equals("")) {
            TanqueModel tm = new TanqueModel(td.getBase().size()+1, (String)spTipo.getSelectedItem(), (Especie) spEspecie.getSelectedItem(), Float.valueOf(tamanho.getText().toString()).floatValue(), Integer.valueOf(quantidade.getText().toString()));
            td.insertTanque(tm);
            finish();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (listTipo.get(position).equals("Tanque-Rede")) {
            if (!tamanho.getText().toString().equals("")) {
                float media = 175 * Float.parseFloat(tamanho.getText().toString());
                twDica.setText(String.valueOf("Dica: Você pode criar em média " + media + " peixes nesse tanque!"));
            }
        }
        if (listTipo.get(position).equals("Tanque-Escavado")) {
            if (!tamanho.getText().toString().equals("")) {
                float media = 30 * Float.parseFloat(tamanho.getText().toString());
                twDica.setText(String.valueOf("Dica: Você pode criar em média " + media + " peixes nesse tanque!"));
            }
        }
        if (listTipo.get(position).equals("Tanque-Elevado")) {
            if (!tamanho.getText().toString().equals("")) {
                float media = 35 * Float.parseFloat(tamanho.getText().toString());
                twDica.setText(String.valueOf("Dica: Você pode criar em média " + media + " peixes nesse tanque!"));
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void finish() {
        startActivity(new Intent(this, Tanques.class));
        super.finish();
    }

    public void registrarBiometria(View view) {
        startActivity(new Intent(this, CadastrarBiometria.class));
        super.finish();
    }
}
