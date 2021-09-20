package com.example.concierge.repository;

import com.example.concierge.model.Historico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface HistoricoRepository extends CrudRepository<Historico, Long> {

    @Query(
            value = "SELECT historico.id as id, "+
            "usuario.nome as nome, "+
            "historico.nota1 as nota1, "+
            "historico.nota2 as nota2 FROM historico "+
            "INNER JOIN aluno ON (historico.id_aluno = aluno.ID) "+
            "Inner Join usuario ON (aluno.id_usuario = usuario.id) "+
            "where historico.id_turma = ?1",nativeQuery = true)
    ArrayList<Object> findHistoricobyTurma(Integer id);
}
