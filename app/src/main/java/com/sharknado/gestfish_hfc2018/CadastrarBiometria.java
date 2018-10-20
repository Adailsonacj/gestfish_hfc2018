package com.sharknado.gestfish_hfc2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastrarBiometria extends AppCompatActivity {

    EditText editTaxaMort;
    EditText editTaxaAlimentacao;
    EditText editQtd;
    EditText editAmostra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_biometria);

        editTaxaMort = findViewById(R.id.editTaxaMort);
        editTaxaAlimentacao = findViewById(R.id.editTaxaAlimentacao);
        editQtd = findViewById(R.id.editQtd);
        editAmostra = findViewById(R.id.editAmostra);
    }

    public void registrar(View view) {

    }
}
