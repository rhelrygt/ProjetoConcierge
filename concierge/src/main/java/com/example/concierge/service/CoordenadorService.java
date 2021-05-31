package com.example.concierge.service;

import com.example.concierge.model.Coordenador;
import com.example.concierge.repository.CoordenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoordenadorService {

    @Autowired
    CoordenadorRepository repository;

    public Coordenador save(Coordenador coordenador){
        return repository.save(coordenador);
    }

    public Optional<Coordenador> findById(Long id) {
        return repository.findById(id);
    }
}
