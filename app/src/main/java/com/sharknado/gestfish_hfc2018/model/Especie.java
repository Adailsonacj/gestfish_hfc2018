package com.sharknado.gestfish_hfc2018.model;

public class Especie {
    private String nome;

    public Especie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
