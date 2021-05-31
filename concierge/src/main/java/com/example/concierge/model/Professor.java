package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Professor() {
    }

    public Professor(Long id, String curso_superior, String especialidade, Long id_usuario) {
        this.id = id;
        this.curso_superior = curso_superior;
        this.especialidade = especialidade;
        this.id_usuario = id_usuario;
    }

    public Professor(String curso_superior, String especialidade, Long id_usuario) {
        this.curso_superior = curso_superior;
        this.especialidade = especialidade;
        this.id_usuario = id_usuario;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "curso_superior")
    private String curso_superior;

    @Column(name = "especialidade")
    private String especialidade;

    @Column(name = "id_usuario")
    private Long id_usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
