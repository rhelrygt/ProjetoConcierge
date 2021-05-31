package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "coordenador")
public class Coordenador implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Coordenador() {
    }

    public Coordenador(Long id, Long id_usuario, String secretaria) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.secretaria = secretaria;
    }

    public Coordenador(Long id_usuario, String secretaria) {
        this.id_usuario = id_usuario;
        this.secretaria = secretaria;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "secretaria")
    private String secretaria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
}
