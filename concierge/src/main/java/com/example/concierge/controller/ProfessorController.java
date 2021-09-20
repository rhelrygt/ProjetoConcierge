package com.example.concierge.controller;

import com.example.concierge.model.Professor;
import com.example.concierge.service.ProfessorService;
import com.example.concierge.view.ProfessorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProfessorView save(@RequestBody ProfessorView professor) {
        try {
            return service.save(professor);
        } catch (Exception e) {
            return new ProfessorView();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Professor> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Collection<Object> findAll() {
        return service.findAllProfessor();
    }

}
