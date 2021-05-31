package com.example.concierge.service;

import com.example.concierge.model.Curso;
import com.example.concierge.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    CursoRepository repository;

    public Curso save(Curso curso){
        return repository.save(curso);
    }

    public Optional<Curso> findById(Long id) {
        return repository.findById(id);
    }
}
