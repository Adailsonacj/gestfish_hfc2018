package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.sharknado.gestfish_hfc2018.dao.CidadeDao;
import com.sharknado.gestfish_hfc2018.dao.EstadoDao;
import com.sharknado.gestfish_hfc2018.dao.UsuarioDao;
import com.sharknado.gestfish_hfc2018.model.Cidade;
import com.sharknado.gestfish_hfc2018.model.Estado;
import com.sharknado.gestfish_hfc2018.model.TipoProducao;
import com.sharknado.gestfish_hfc2018.model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cadastro extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EstadoDao estadoDao;
    private CidadeDao cidadeDao;
    private UsuarioDao usuarioDao;

    private Spinner cidades;
    private Spinner estados;
    private Spinner tipos;

    private EditText email;
    private EditText senha;
    private EditText nome;
    private EditText sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        estadoDao = new EstadoDao();
        cidadeDao = new CidadeDao();
        usuarioDao = new UsuarioDao();

        estados = findViewById(R.id.estados);
        cidades = findViewById(R.id.cidades);
        tipos = findViewById(R.id.tipoProducao);

        email = findViewById(R.id.emailCadastro);
        senha = findViewById(R.id.senhaCadastro);
        sobrenome = findViewById(R.id.sobrenome);
        nome = findViewById(R.id.Nome);

        tipos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(TipoProducao.values())));
        estados.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, estadoDao.getBase()));
        cidades.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cidadeList(((Estado) estados.getSelectedItem()))));
        estados.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Estado e = (Estado) estados.getSelectedItem();
        cidades.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cidadeList(e)));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public List<Cidade> cidadeList(Estado e){
        ArrayList citys = new ArrayList();
        citys.add(new Estado("Selecione sua cidade", ""));
        citys.addAll(cidadeDao.findByUf(e.getUs()));
        return citys;
    }

    public void cadastrar(View view){
        boolean fail = false;
        if (email.getText().toString().equals("")){
            fail = true;
            email.setError("Informe um email");
        }
        if (senha.getText().toString().equals("")){
            fail = true;
            senha.setError("Informe uma senha");
        }
        if (sobrenome.getText().toString().equals("")){
            fail = true;
            sobrenome.setError("Informe seu sobrenome");
        }
        if (nome.getText().toString().equals("")){
            fail = true;
            nome.setError("Informe seu nome");
        }
        if (fail){
            return;
        }
        Intent vrintention = new Intent(this, Home.class);
        usuarioDao.insert(new Usuario(nome.getText().toString(), sobrenome.getText().toString(), email.getText().toString(), senha.getText().toString(), (TipoProducao) tipos.getSelectedItem()));
        Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso" , Toast.LENGTH_SHORT ).show();
        startActivity(vrintention);
        finish();
    }
}
