package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "historico")
public class Historico implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Historico() {
    }

    public Historico(Long id, Long id_turma, Long id_aluno, Double nota1, Double nota2, Double media) {
        this.id = id;
        this.id_turma = id_turma;
        this.id_aluno = id_aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public Historico(Long id_turma, Long id_aluno, Double nota1, Double nota2, Double media) {
        this.id_turma = id_turma;
        this.id_aluno = id_aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "id_turma")
    private Long id_turma;

    @Column(name = "id_aluno")
    private Long id_aluno;

    @Column(name = "nota1")
    private Double nota1;

    @Column(name = "nota2")
    private Double nota2;

    @Column(name = "media")
    private Double media;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_turma() {
        return id_turma;
    }

    public void setId_turma(Long id_turma) {
        this.id_turma = id_turma;
    }

    public Long getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Long id_aluno) {
        this.id_aluno = id_aluno;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
