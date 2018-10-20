package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.Tanques;
import com.sharknado.gestfish_hfc2018.model.Cidade;
import com.sharknado.gestfish_hfc2018.model.TanqueModel;
import com.sharknado.gestfish_hfc2018.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class TanqueDao extends DaoGenerica<TanqueModel> {
    private static ArrayList<TanqueModel> models = new ArrayList<>();
    EspecieDao especieDao = new EspecieDao();
    public TanqueDao() {
        super();
        if (models.isEmpty()){
        models.add(new TanqueModel("Tanque Escavado", especieDao.findByNome("Tilápia"),  20, 1000));
        models.add(new TanqueModel("Tanque Rede", especieDao.findByNome("Pacu"),  50, 2000));
        models.add(new TanqueModel("Tanque Elevado", especieDao.findByNome("Tambacu"), 60, 2000));}
    }

    public void insertTanque(TanqueModel tanqueModel){
        models.add(tanqueModel);
    }

    @Override
    public ArrayList<TanqueModel> getBase() {
        return models;
    }
}
