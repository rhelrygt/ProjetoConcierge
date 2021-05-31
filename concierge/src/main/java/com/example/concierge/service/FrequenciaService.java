package com.example.concierge.service;

import com.example.concierge.model.Frequencia;
import com.example.concierge.repository.FrequenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrequenciaService {

    @Autowired
    FrequenciaRepository repository;

    public Frequencia save(Frequencia frequencia){
        return repository.save(frequencia);
    }

    public Optional<Frequencia> findById(Long id) {
        return repository.findById(id);
    }

}
