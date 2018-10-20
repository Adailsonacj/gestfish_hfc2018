package com.sharknado.gestfish_hfc2018.model;

public class Estado {
    private String nome;
    private String us;

    public Estado(String nome, String us) {
        this.nome = nome;
        this.us = us;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    @Override
    public String toString() {
        return nome;
    }
}
