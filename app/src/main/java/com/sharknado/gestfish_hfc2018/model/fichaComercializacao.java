package com.sharknado.gestfish_hfc2018.model;

public class fichaComercializacao {

    private String nomeComprador;
    private String nomeVendedor;
    private String especiePeixe;
    private float precoUnitario;
    private float quantidadeKg;
    private float precoTotal;

    //Contrutuor Fazio
    public fichaComercializacao(){}

    //Construdor com todos os parametros
    public fichaComercializacao(String nomeVendedor, String nomeComprador,
                                String especiePeixe, float precoUnitario, float quantidadeKg, float precoTotal){
        this.nomeVendedor = nomeVendedor;
        this.nomeComprador = nomeComprador;
        this.especiePeixe = especiePeixe;
        this.precoUnitario = precoUnitario;
        this.quantidadeKg = quantidadeKg;
        this.precoTotal = precoTotal;

    }


    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getEspeciePeixe() {
        return especiePeixe;
    }

    public void setEspeciePeixe(String especiePeixe) {
        this.especiePeixe = especiePeixe;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getQuantidadeKg() {
        return quantidadeKg;
    }

    public void setQuantidadeKg(float quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return this.nomeVendedor +" - "+ this.nomeComprador  +" - "+ this.especiePeixe  +" - "+ this.precoUnitario  +" - "+ this.quantidadeKg  +" - "+ this.precoTotal;
    }
}

