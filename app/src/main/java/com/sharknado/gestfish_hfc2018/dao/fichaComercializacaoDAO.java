package com.sharknado.gestfish_hfc2018.dao;

import com.sharknado.gestfish_hfc2018.model.fichaComercializacao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class fichaComercializacaoDAO {

    private ArrayList<fichaComercializacao> listaFichas = new ArrayList<>();

    public ArrayList<fichaComercializacao> getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(ArrayList<fichaComercializacao> listaFichas) {
        this.listaFichas = listaFichas;
    }
}
