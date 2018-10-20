package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Cidade;

import java.util.ArrayList;

public class CidadeDao extends DaoGenerica<Cidade> {
    private EstadoDao estadoDao = new EstadoDao();

    public CidadeDao() {
        super();
        getBase().add(new Cidade("Abreulandia", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Aguiarnopolis", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Axixa do Tocantins", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Esperantina", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Novo Alegre", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Novo Jardim", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Riachinho", estadoDao.findByUf("to")));
        getBase().add(new Cidade("Xambioa", estadoDao.findByUf("to")));
    }

    public ArrayList<Cidade> findByUf(String uf) {
        ArrayList<Cidade> cidades = new ArrayList<>();
        for (Cidade c : getBase()) {
            if (c.getEstado().getUs().toLowerCase().equals(uf.toLowerCase())) {
                cidades.add(c);
            }
        }
        return cidades.isEmpty() ? new ArrayList<Cidade>() : cidades;
    }

    public Cidade findByNome(String nome){
        for(Cidade e : getBase()){
            if (e.getNome().toLowerCase().equals(nome.toLowerCase())){
                return e;
            }
        }
        return null;
    }
}
