package com.example.concierge.view;

public class ProfessorView {

    public ProfessorView() {
    }

    public ProfessorView(Long id, Long cpf, String senha, String nome, String curso_superior, String especialidade, Long id_usuario) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.curso_superior = curso_superior;
        this.especialidade = especialidade;
        this.id_usuario = id_usuario;
    }

    public ProfessorView(Long cpf, String senha, String nome, String curso_superior, String especialidade, Long id_usuario) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.curso_superior = curso_superior;
        this.especialidade = especialidade;
        this.id_usuario = id_usuario;
    }

    private Long id;
    private Long cpf;
    private String senha;
    private String nome;
    private String curso_superior;
    private String especialidade;
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

    public String getCurso_superior() {
        return curso_superior;
    }

    public void setCurso_superior(String curso_superior) {
        this.curso_superior = curso_superior;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
