package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Cidade;
import com.sharknado.gestfish_hfc2018.model.Especie;

import java.util.ArrayList;


public class EspecieDao extends DaoGenerica<Especie> {
    private EstadoDao estadoDao = new EstadoDao();

    public EspecieDao() {
        super();
        getBase().add(new Especie("Tilápia"));
        getBase().add(new Especie("Pacu"));
        getBase().add(new Especie("Tambaqui"));
        getBase().add(new Especie("Tambacu"));
        getBase().add(new Especie("Tilápia"));
    }

    public Especie findByNome(String nome) {
        for (Especie e : getBase()) {
            if (e.getNome().toLowerCase().equals(nome.toLowerCase())) {
                return e;
            }
        }
        return null;
    }

}
