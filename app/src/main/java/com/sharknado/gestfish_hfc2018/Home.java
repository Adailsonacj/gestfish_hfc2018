package com.sharknado.gestfish_hfc2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sharknado.gestfish_hfc2018.dao.UsuarioDao;
import com.sharknado.gestfish_hfc2018.model.Usuario;

public class Home extends AppCompatActivity{

    private EditText email;
    private EditText senha;
    private Button button;
    private UsuarioDao usuarioDao;
    private Usuario usuarioLogado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email = findViewById(R.id.senhaCadastro);
        senha = findViewById(R.id.senha);
        button = findViewById(R.id.login);

        usuarioDao = new UsuarioDao();
    }

    public void login(View view){
        if ((usuarioLogado = usuarioDao.findByEmail(email.getText().toString())) != null){
            if (usuarioLogado.getSenha().equals(senha.getText().toString())){
                Toast.makeText(getBaseContext(), "Login realizado com sucesso" , Toast.LENGTH_SHORT ).show();
                Intent vrintention = new Intent(this, Tanques.class);
                startActivity(vrintention);
                finish();
            }
        }else{
            Toast.makeText(getBaseContext(), "Senha ou E-mail incorretos" , Toast.LENGTH_SHORT ).show();
        }
    }

    public void cadastro(View view){
        Intent vrintention = new Intent(this, Cadastro.class);
        startActivity(vrintention);
        finish();
    }
}
