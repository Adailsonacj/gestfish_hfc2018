package com.sharknado.gestfish_hfc2018.model;

public enum TipoProducao {
    SEMI_INTENSIVO("Semi-Intensivo"), INTENSIVO("Intensivo");

    private String label;

    TipoProducao(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
