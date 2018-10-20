package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.TipoProducao;
import com.sharknado.gestfish_hfc2018.model.Usuario;

import java.util.ArrayList;

public class UsuarioDao  extends DaoGenerica<Usuario>{
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioDao() {
        super();
        getBase().add(new Usuario("Daniel", "Carvalho", "teste@gmail.com", "teste", TipoProducao.INTENSIVO));
        getBase().add(new Usuario("Nareilson", "Bispo", "teste3@gmail.com", "teste", TipoProducao.SEMI_INTENSIVO));
        getBase().add(new Usuario("Adailson", "Aguiar", ".", ".", TipoProducao.SEMI_INTENSIVO));
    }

    public Usuario findByEmail(String email){
        for(Usuario e : getBase()){
            if (e.getEmail().toLowerCase().equals(email.toLowerCase())){
                return e;
            }
        }
        return null;
    }

    public void insert(Usuario u){
        getBase().add(u);
    }

    @Override
    public ArrayList<Usuario> getBase() {
        return usuarios;
    }
}
