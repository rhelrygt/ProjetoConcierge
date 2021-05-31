package com.example.concierge.repository;

import com.example.concierge.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository  extends CrudRepository<Professor, Long> {
}
