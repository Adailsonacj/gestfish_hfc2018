package com.sharknado.gestfish_hfc2018.model;

public class TanqueModel {
    private Integer id;
    private String tipo;
    private Especie especie;
    private float tamanho;
    private int qtdPeixes;

    public TanqueModel(Integer id, String tipo, Especie especie, float tamanho, int qtdPeixes) {
        this.tipo = tipo;
        this.id = id;
        this.especie = especie;
        this.tamanho = tamanho;
        this.qtdPeixes = qtdPeixes;
    }

    public int getQtdPeixes() {

        return qtdPeixes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQtdPeixes(int qtdPeixes) {
        this.qtdPeixes = qtdPeixes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
