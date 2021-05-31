package com.example.concierge.controller;

import com.example.concierge.model.Turma;
import com.example.concierge.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    TurmaService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Turma save(@RequestBody Turma turma) {
        try {
            return service.save(turma);
        } catch (Exception e) {
            return new Turma();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Turma> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }
}
