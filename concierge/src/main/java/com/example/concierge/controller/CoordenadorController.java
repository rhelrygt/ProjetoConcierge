package com.example.concierge.controller;

import com.example.concierge.model.Aluno;
import com.example.concierge.model.Coordenador;
import com.example.concierge.service.CoordenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coordenador")
public class CoordenadorController {

    @Autowired
    CoordenadorService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Coordenador save(@RequestBody Coordenador coordenador) {
        try {
            return service.save(coordenador);
        } catch (Exception e) {
            return new Coordenador();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Coordenador> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }
}
