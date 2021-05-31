package com.example.concierge.controller;

import com.example.concierge.model.Aluno;
import com.example.concierge.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Aluno save(@RequestBody Aluno aluno) {
        try {
            return service.save(aluno);
        } catch (Exception e) {
            return new Aluno();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Aluno> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }

}
