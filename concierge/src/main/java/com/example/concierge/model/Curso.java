package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Curso() {
    }

    public Curso(Long id, String nome_curso, String descricao_curso, Long carga_horaria) {
        this.id = id;
        this.nome_curso = nome_curso;
        this.descricao_curso = descricao_curso;
        this.carga_horaria = carga_horaria;
    }

    public Curso(String nome_curso, String descricao_curso, Long carga_horaria) {
        this.nome_curso = nome_curso;
        this.descricao_curso = descricao_curso;
        this.carga_horaria = carga_horaria;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome_curso")
    private String nome_curso;

    @Column(name = "descricao_curso")
    private String descricao_curso;

    @Column(name = "carga_horaria")
    private Long carga_horaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getDescricao_curso() {
        return descricao_curso;
    }

    public void setDescricao_curso(String descricao_curso) {
        this.descricao_curso = descricao_curso;
    }

    public Long getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Long carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
