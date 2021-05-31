package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "frequencia")
public class Frequencia implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Frequencia() {
    }

    public Frequencia(Long id, Long id_turma, Long id_aluno, Date data_aula, boolean presenca) {
        this.id = id;
        this.id_turma = id_turma;
        this.id_aluno = id_aluno;
        this.data_aula = data_aula;
        this.presenca = presenca;
    }

    public Frequencia(Long id_turma, Long id_aluno, Date data_aula, boolean presenca) {
        this.id_turma = id_turma;
        this.id_aluno = id_aluno;
        this.data_aula = data_aula;
        this.presenca = presenca;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "id_turma")
    private Long id_turma;

    @Column(name = "id_aluno")
    private Long id_aluno;

    @Column(name = "id_aluno")
    private Date data_aula;

    @Column(name = "presenca")
    private boolean presenca;

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

    public Date getData_aula() {
        return data_aula;
    }

    public void setData_aula(Date data_aula) {
        this.data_aula = data_aula;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
}
