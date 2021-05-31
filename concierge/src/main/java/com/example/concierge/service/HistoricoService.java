package com.example.concierge.service;

import com.example.concierge.model.Historico;
import com.example.concierge.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistoricoService {
    @Autowired
    HistoricoRepository repository;

    public Historico save(Historico historico){
        return repository.save(historico);
    }

    public Optional<Historico> findById(Long id) {
        return repository.findById(id);
    }
}
