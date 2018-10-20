package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.TipoProducao;
import com.sharknado.gestfish_hfc2018.model.Usuario;

public class UsuarioDao  extends DaoGenerica<Usuario>{
    public UsuarioDao() {
        super();
        getBase().add(new Usuario("Daniel", "Carvalho", "teste1@gmail.com", "teste", TipoProducao.INTENSIVO));
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
}
