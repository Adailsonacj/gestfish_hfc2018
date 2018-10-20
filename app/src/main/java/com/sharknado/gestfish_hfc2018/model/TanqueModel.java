package com.sharknado.gestfish_hfc2018.model;

public class TanqueModel {
    private String tipo;
    private String tipoProducao;
    private String especie;
    private float tamanho;
    private int qtdPeixes;

    public TanqueModel(String tipo, String tipoProducao, String especie, float tamanho, int qtdPeixes) {
        this.tipo = tipo;
        this.tipoProducao = tipoProducao;
        this.especie = especie;
        this.tamanho = tamanho;
        this.qtdPeixes = qtdPeixes;
    }

    public int getQtdPeixes() {

        return qtdPeixes;
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

    public String getTipoProducao() {
        return tipoProducao;
    }

    public void setTipoProducao(String tipoProducao) {
        this.tipoProducao = tipoProducao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
