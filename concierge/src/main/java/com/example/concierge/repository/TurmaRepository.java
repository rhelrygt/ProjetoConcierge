package com.example.concierge.repository;

import com.example.concierge.model.Turma;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TurmaRepository extends CrudRepository<Turma, Long> {

    @Query(
            value = "SELECT turma.id as id, "+
            "turma.data_inicio as data_inicio, "+
            "turma.data_final as data_final, "+
            "turma.horario_inicio as horario_inicio, "+
            "turma.horario_final as horario_final, "+
            "turma.qtdmax_alunos as qtdmax_alunos, "+
            "turma.local_turma as local_turma, "+
            "curso.nome_curso as nome FROM turma "+
            "INNER JOIN curso ON (curso.ID = turma.ID_curso)",nativeQuery = true)
    ArrayList<Object> findTurmas();

    @Query(
            value = "SELECT turma.id as id, "+
                    "turma.data_inicio as data_inicio, "+
                    "turma.data_final as data_final, "+
                    "turma.horario_inicio as horario_inicio, "+
                    "turma.horario_final as horario_final, "+
                    "turma.qtdmax_alunos as qtdmax_alunos, "+
                    "turma.local_turma as local_turma, "+
                    "curso.nome_curso as nome FROM turma "+
                    "INNER JOIN curso ON (curso.ID = turma.ID_curso) "+
                    "WHERE turma.id_professor = ?1",nativeQuery = true)
    ArrayList<Object> findTurmaByProfessor(Integer id);

    @Query(
            value = "SELECT turma.id as id, "+
           " turma.data_inicio as data_inicio, "+
            "turma.data_final as data_final, "+
            "turma.horario_inicio as horario_inicio, "+
            "turma.horario_final as horario_final, "+
            "turma.qtdmax_alunos as qtdmax_alunos, "+
            "turma.local_turma as local_turma, "+
            "curso.nome_curso as nome FROM turma "+
            "INNER JOIN historico ON (historico.id_turma = turma.ID) "+
            "INNER JOIN curso ON (curso.id = turma.ID_curso) "+
            "where historico.id_aluno = ?1",nativeQuery = true)
    ArrayList<Object> findTurmaByAluno(Integer id);
}
