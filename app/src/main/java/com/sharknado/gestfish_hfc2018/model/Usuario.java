package com.sharknado.gestfish_hfc2018.model;

public class Usuario {
    private String nome;
    private String sobreNome;
    private String email;
    private String senha;
    private TipoProducao tipoProducao;

    public Usuario(String nome, String sobreNome, String email, String senha, TipoProducao tipoProducao) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.senha = senha;
        this.tipoProducao = tipoProducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoProducao getTipoProducao() {
        return tipoProducao;
    }

    public void setTipoProducao(TipoProducao tipoProducao) {
        this.tipoProducao = tipoProducao;
    }
}
