package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.sharknado.gestfish_hfc2018.model.fichaComercializacao;

import java.util.ArrayList;
import java.util.List;

public class ComercializacaoActivity extends AppCompatActivity {

    List<fichaComercializacao>  listaFicha;
    ListView listViewComercializacao;
    Button novoComercializacao;
   ArrayAdapter<fichaComercializacao> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comercializacao);
        listViewComercializacao = findViewById(R.id.listaComercializacoes);
        novoComercializacao = findViewById(R.id.buttonNovoComercializacao);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.get("nomeVendedor") != null){
            fichaComercializacao fichaComercializacao = new fichaComercializacao();
            fichaComercializacao.setNomeVendedor(bundle.getString("nomeVendedor"));
            fichaComercializacao.setNomeComprador(bundle.getString("nomeComprador"));
            fichaComercializacao.setEspeciePeixe(bundle.getString("especiePeixe"));
            fichaComercializacao.setPrecoUnitario(bundle.getFloat("valorUnitario"));
            fichaComercializacao.setQuantidadeKg(bundle.getFloat("quantidadeKG"));
            fichaComercializacao.setPrecoTotal(bundle.getFloat("valorTotal"));

            preencherLItView(fichaComercializacao);



            Toast.makeText(this, fichaComercializacao.getNomeVendedor(), Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show();


        novoComercializacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ComercializacaoActivity.this,FichaComercializacaoActivity.class);
                startActivity(intent);

                finish();

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    public void preencherLItView(fichaComercializacao ficha){

        ArrayList<fichaComercializacao> fichaCome = new ArrayList<>();
        fichaCome.add(ficha);
        listaFicha = fichaCome;
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaFicha);
        listViewComercializacao.setAdapter(adapter);

    }
}
