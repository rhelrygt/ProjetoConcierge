package com.example.concierge.controller;

import com.example.concierge.model.Professor;
import com.example.concierge.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Professor save(@RequestBody Professor professor) {
        try {
            return service.save(professor);
        } catch (Exception e) {
            return new Professor();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Professor> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }

}
