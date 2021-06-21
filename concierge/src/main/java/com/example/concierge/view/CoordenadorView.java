package com.example.concierge.view;

import javax.persistence.Column;

public class CoordenadorView {

    public CoordenadorView() {
    }

    public CoordenadorView(Long id, Long cpf, String senha, String nome, String secretaria, Long id_usuario) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.secretaria = secretaria;
        this.id_usuario = id_usuario;
    }

    public CoordenadorView(Long cpf, String senha, String nome, String secretaria, Long id_usuario) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.secretaria = secretaria;
        this.id_usuario = id_usuario;
    }

    private Long id;
    private Long cpf;
    private String senha;
    private String nome;
    private String secretaria;
    private Long id_usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
