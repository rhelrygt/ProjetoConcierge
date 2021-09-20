package com.example.concierge.controller;

import com.example.concierge.model.Historico;
import com.example.concierge.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    HistoricoService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Historico save(@RequestBody Historico historico) {
        try {
            return service.save(historico);
        } catch (Exception e) {
            return new Historico();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Historico> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findbyturma/{id}", method = RequestMethod.GET)
    public ArrayList<Object> findHistoricoByTurma(@PathVariable(value = "id")Integer id) {
        return service.findHistoricoByTurma(id);
    }
}
