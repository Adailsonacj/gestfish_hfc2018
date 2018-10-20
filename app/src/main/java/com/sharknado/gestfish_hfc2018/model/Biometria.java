package com.sharknado.gestfish_hfc2018.model;

import java.util.Date;

public class Biometria {
    private Date data;
    private String taxaAlimentacao;
    private String qtdPeixes;
    private String biomassaTotal;
    private String taxaMortalidade;
    private String QtdAmostra;

    public Biometria(Date data, String taxaAlimentacao, String qtdPeixes, String biomassaTotal, String taxaMortalidade, String qtdAmostra) {
        this.data = data;
        this.taxaAlimentacao = taxaAlimentacao;
        this.qtdPeixes = qtdPeixes;
        this.biomassaTotal = biomassaTotal;
        this.taxaMortalidade = taxaMortalidade;
        QtdAmostra = qtdAmostra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTaxaAlimentacao() {
        return taxaAlimentacao;
    }

    public void setTaxaAlimentacao(String taxaAlimentacao) {
        this.taxaAlimentacao = taxaAlimentacao;
    }

    public String getQtdPeixes() {
        return qtdPeixes;
    }

    public void setQtdPeixes(String qtdPeixes) {
        this.qtdPeixes = qtdPeixes;
    }

    public String getBiomassaTotal() {
        return biomassaTotal;
    }

    public void setBiomassaTotal(String biomassaTotal) {
        this.biomassaTotal = biomassaTotal;
    }

    public String getTaxaMortalidade() {
        return taxaMortalidade;
    }

    public void setTaxaMortalidade(String taxaMortalidade) {
        this.taxaMortalidade = taxaMortalidade;
    }

    public String getQtdAmostra() {
        return QtdAmostra;
    }

    public void setQtdAmostra(String qtdAmostra) {
        QtdAmostra = qtdAmostra;
    }
}
