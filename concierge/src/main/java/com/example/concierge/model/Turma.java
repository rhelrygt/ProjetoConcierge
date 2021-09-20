package com.example.concierge.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "turma")
public class Turma implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;

    public Turma() {
    }

    public Turma(Date data_inicio, Date data_fim, Date periodo_inscricao, String horario_inicio, String horario_final, Long qtdMax_alunos, String local_turma, Long id_curso, Long id_professor) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.periodo_inscricao = periodo_inscricao;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.qtdMax_alunos = qtdMax_alunos;
        this.local_turma = local_turma;
        this.id_curso = id_curso;
        this.id_professor = id_professor;
    }

    public Turma(Long id, Date data_inicio, Date data_fim, Date periodo_inscricao, String horario_inicio, String horario_final, Long qtdMax_alunos, String local_turma, Long id_curso, Long id_professor) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.periodo_inscricao = periodo_inscricao;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.qtdMax_alunos = qtdMax_alunos;
        this.local_turma = local_turma;
        this.id_curso = id_curso;
        this.id_professor = id_professor;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "data_inicio")
    private Date data_inicio;

    @Column(name = "data_final")
    private Date data_fim;

    @Column(name = "periodo_inscricao")
    private Date periodo_inscricao;

    @Column(name = "horario_inicio")
    private String horario_inicio;

    @Column(name = "horario_final")
    private String horario_final;

    @Column(name = "qtdmax_alunos")
    private Long qtdMax_alunos;

    @Column(name = "local_turma")
    private String local_turma;

    @Column(name = "id_curso")
    private Long id_curso;

    @Column(name = "id_professor")
    private Long id_professor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Date getPeriodo_inscricao() {
        return periodo_inscricao;
    }

    public void setPeriodo_inscricao(Date periodo_inscricao) {
        this.periodo_inscricao = periodo_inscricao;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }

    public Long getQtdMax_alunos() {
        return qtdMax_alunos;
    }

    public void setQtdMax_alunos(Long qtdMax_alunos) {
        this.qtdMax_alunos = qtdMax_alunos;
    }

    public String getLocal_turma() {
        return local_turma;
    }

    public void setLocal_turma(String local_turma) {
        this.local_turma = local_turma;
    }

    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public Long getId_professor() {
        return id_professor;
    }

    public void setId_professor(Long id_professor) {
        this.id_professor = id_professor;
    }


}
