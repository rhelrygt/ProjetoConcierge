package com.example.concierge.repository;

import com.example.concierge.model.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProfessorRepository  extends CrudRepository<Professor, Long> {

    @Query(
            value = "SELECT professor.id as id, usuario.nome as nome FROM usuario INNER JOIN PROFESSOR ON (usuario.ID = PROFESSOR.ID_USUARIO)",nativeQuery = true)
    Collection<Object> findAllProfessores();
}
