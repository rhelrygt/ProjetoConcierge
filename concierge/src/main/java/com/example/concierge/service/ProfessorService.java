package com.example.concierge.service;

import com.example.concierge.model.Professor;
import com.example.concierge.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;

    public Professor save(Professor professor){
        return repository.save(professor);
    }

    public Optional<Professor> findById(Long id) {
        return repository.findById(id);
    }
}
