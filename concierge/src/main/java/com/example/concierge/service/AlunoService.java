package com.example.concierge.service;

import com.example.concierge.model.Aluno;
import com.example.concierge.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public Aluno save(Aluno aluno){
        return repository.save(aluno);
    }

    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }
}
