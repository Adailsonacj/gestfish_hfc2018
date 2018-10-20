package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.Biometria;
import com.sharknado.gestfish_hfc2018.model.TanqueModel;

import java.util.ArrayList;
import java.util.List;

public class BiometriaDao extends DaoGenerica<Biometria> {

    public static List<Biometria> listBiometria = new ArrayList<>();
    public BiometriaDao (){
        super();
    }

    public void insertTanque(Biometria biometria){
    }

    public void insertBiometria(Biometria biometria){
        listBiometria.add(biometria);
    }

}
