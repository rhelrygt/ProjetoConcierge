package com.example.concierge.view;

public class UserView {
    public UserView() {
    }

    public UserView(Long id) {
        this.id = id;
    }

    public UserView(Long id, String papel, String nome) {
        this.id = id;
        this.papel = papel;
        this.nome = nome;
    }

    private Long id;
    private String papel;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
