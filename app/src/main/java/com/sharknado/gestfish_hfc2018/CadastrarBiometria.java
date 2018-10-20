package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sharknado.gestfish_hfc2018.dao.BiometriaDao;
import com.sharknado.gestfish_hfc2018.model.Biometria;

import java.util.Date;

public class CadastrarBiometria extends AppCompatActivity {

    EditText editTaxaMort;
    EditText editBiomassa;
    EditText editTaxaAlimentacao;
    EditText editQtd;
    EditText editAmostra;
    BiometriaDao biometriaDao = new BiometriaDao();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_biometria);

        editTaxaMort = findViewById(R.id.editTaxaMort);
        editBiomassa = findViewById(R.id.editBiomassa);
        editTaxaAlimentacao = findViewById(R.id.editTaxaAlimentacao);
        editQtd = findViewById(R.id.editQtd);
        editAmostra = findViewById(R.id.editAmostra);
    }

    public void registrar(View view) {
        Biometria biometria = new Biometria(new Date(), editTaxaAlimentacao.getText().toString(), editQtd.getText().toString()
                , editBiomassa.getText().toString(), editTaxaMort.getText().toString(), editAmostra.getText().toString());
        biometriaDao.insertBiometria(biometria);
        super.finish();
    }
}
