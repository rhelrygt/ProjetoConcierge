package com.example.concierge.controller;

import com.example.concierge.model.Curso;
import com.example.concierge.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Curso save(@RequestBody Curso curso) {
        try {
            return service.save(curso);
        } catch (Exception e) {
            return new Curso();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Curso> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Curso> getList(){
        return service.getList();
    }

}
