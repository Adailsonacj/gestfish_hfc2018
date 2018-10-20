package com.sharknado.gestfish_hfc2018.dao;

import java.util.ArrayList;

public class DaoGenerica<T> {
    private ArrayList<T> base;

    public DaoGenerica() {
        this.base = new ArrayList<>();
    }

    public ArrayList<T> getBase() {
        return base;
    }

    public void setBase(ArrayList<T> base) {
        this.base = base;
    }
}
