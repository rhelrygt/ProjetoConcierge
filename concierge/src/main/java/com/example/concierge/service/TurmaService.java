package com.example.concierge.service;

import com.example.concierge.model.Turma;
import com.example.concierge.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository repository;

    public Turma save(Turma turma){
        return repository.save(turma);
    }

    public Optional<Turma> findById(Long id) {
        return repository.findById(id);
    }

    public ArrayList<Object> findListCard(){
        ArrayList<Object> list = new ArrayList<>() ;
        list = repository.findTurmas();
        return list;
    }

    public ArrayList<Object> findListCardByProfessor(Integer id){
        ArrayList<Object> list = new ArrayList<>() ;
        list = repository.findTurmaByProfessor(id);
        return list;
    }

    public ArrayList<Object> findListCardByAluno(Integer id){
        ArrayList<Object> list = new ArrayList<>() ;
        list = repository.findTurmaByAluno(id);
        return list;
    }
}
