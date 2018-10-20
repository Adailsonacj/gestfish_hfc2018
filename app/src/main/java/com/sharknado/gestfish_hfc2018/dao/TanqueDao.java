package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Cidade;
import com.sharknado.gestfish_hfc2018.model.TanqueModel;
import com.sharknado.gestfish_hfc2018.model.Usuario;

import java.util.ArrayList;

public class TanqueDao extends DaoGenerica<TanqueModel> {
    public TanqueDao() {
        super();
        getBase().add(new TanqueModel("Tanque Escavado", "Semi-Intensivo", "Tambaqui", 20, 1000));
        getBase().add(new TanqueModel("Tanque Rede", "Intensivo", "Pacu", 50, 2000));
        getBase().add(new TanqueModel("Tanque Elevado", "Intensivo", "Tilápia", 60, 2000));
    }

    public ArrayList<TanqueModel> findAll() {
        ArrayList<TanqueModel> tanque = new ArrayList<>();
        for (TanqueModel c : getBase()) {
            tanque.add(c);
        }
        return tanque.isEmpty() ? null : tanque;
    }

    public void insertTanque(){

    }
}
