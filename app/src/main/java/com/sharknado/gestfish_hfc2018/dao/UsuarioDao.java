package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Usuario;

public class UsuarioDao  extends DaoGenerica<Usuario>{
    public UsuarioDao() {
        super();
        getBase().add(new Usuario("Daniel", "Carvalho", "danielarraiscarvalho@gmail.com", "12345678"));
        getBase().add(new Usuario("Adailson", "Aguiar", "adailsonaguiar@gmail.com", "12345678"));
        getBase().add(new Usuario("Nareilson", "Bispo", "nareilsonbispo@gmail.com", "12345678"));
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
