package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class FichaComercializacaoActivity extends AppCompatActivity {

    EditText nomeVendedor;
    EditText nomeComprador;
    EditText valorUnitario;
    EditText quantidadeKG;
    EditText valorTotal;
    Button buttonConfirmar;
    Button buttonCacelar;
    Spinner especiePeixeSpinner;

    List<String> listaPeixe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_comercializacao);

        nomeVendedor = findViewById(R.id.nomeVendedor);
        nomeComprador = findViewById(R.id.nomeComprador);
        valorUnitario = findViewById(R.id.valorUnitario);
        quantidadeKG = findViewById(R.id.quantidadeKg);
        valorTotal = findViewById(R.id.valorTotal);
        especiePeixeSpinner = findViewById(R.id.especiePeixeSpinner);


        buttonCacelar = findViewById(R.id.buttonCancelar);
        buttonConfirmar = findViewById(R.id.buttonConfirmar);

        listaPeixe = new ArrayList<String>();

        listaPeixe.add("Pacu");
        listaPeixe.add("Tucunare");

        ArrayAdapter<String> adapterPeixeLista = new ArrayAdapter<>(this,android.R.layout.simple_selectable_list_item,listaPeixe);
        adapterPeixeLista.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        especiePeixeSpinner.setAdapter(adapterPeixeLista);

        buttonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Passando os dados da ficha para a tela de lista
                Bundle bundle = new Bundle();
                bundle.putString("nomeVendedor",nomeVendedor.getText().toString());
                bundle.putString("nomeComprador",nomeComprador.getText().toString());
                bundle.putFloat("valorUnitario",Float.parseFloat(valorUnitario.getText().toString()));
                bundle.putFloat("quantidadeKG",Float.parseFloat(quantidadeKG.getText().toString()));
                bundle.putFloat("valorTotal", Float.parseFloat(valorTotal.getText().toString()));
                bundle.putString("especiePeixe",especiePeixeSpinner.getSelectedItem().toString());



                Intent intencao = new Intent(FichaComercializacaoActivity.this,ComercializacaoActivity.class);
                intencao.putExtras(bundle);

                startActivity(intencao);
                finish();
            }
        });

        buttonCacelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeComprador.setText("");
                nomeVendedor.setText("");
                valorUnitario.setText("");
                quantidadeKG.setText("");
                valorTotal.setText("");
            }
        });



    }
}
