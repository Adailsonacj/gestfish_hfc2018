package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Estado;

public class EstadoDao extends DaoGenerica<Estado> {

    public EstadoDao() {
        super();
        getBase().add(new Estado("Selecione seu estado", ""));
        getBase().add(new Estado("Acre", "AC"));
        getBase().add(new Estado("Alagoas", "AL"));
        getBase().add(new Estado("Amapá", "AP"));
        getBase().add(new Estado("Amazonas", "AM"));
        getBase().add(new Estado("Bahia", "BA"));
        getBase().add(new Estado("Ceará", "CE"));
        getBase().add(new Estado("Distrito Federal", "DF"));
        getBase().add(new Estado("Espírito Santo", "ES"));
        getBase().add(new Estado("Goiás", "GO"));
        getBase().add(new Estado("Maranhão", "MA"));
        getBase().add(new Estado("Mato Grosso", "MT"));
        getBase().add(new Estado("Mato Grosso do Sul", "MS"));
        getBase().add(new Estado("Minas Gerais", "MG"));
        getBase().add(new Estado("Pará", "PA"));
        getBase().add(new Estado("Paraíba", "PB"));
        getBase().add(new Estado("Paraná", "PR"));
        getBase().add(new Estado("Pernambuco", "PE"));
        getBase().add(new Estado("Piauí", "PI"));
        getBase().add(new Estado("Rio de Janeiro", "RJ"));
        getBase().add(new Estado("Rio Grande do Norte", "RN"));
        getBase().add(new Estado("Rio Grande do Sul", "RS"));
        getBase().add(new Estado("Rondônia", "RO"));
        getBase().add(new Estado("Roraima", "RR"));
        getBase().add(new Estado("Santa Catarina", "SC"));
        getBase().add(new Estado("São Paulo", "SP"));
        getBase().add(new Estado("Sergipe", "SE"));
        getBase().add(new Estado("Tocantins", "TO"));
    }

    public Estado findByUf(String uf){
        for(Estado e : getBase()){
            if (e.getUs().toLowerCase().equals(uf.toLowerCase())){
                return e;
            }
        }
        return null;
    }
}
