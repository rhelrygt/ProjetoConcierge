package com.example.concierge.controller;

import com.example.concierge.model.Frequencia;
import com.example.concierge.service.FrequenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/frequencia")
public class FrequenciaController {

    @Autowired
    FrequenciaService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Frequencia save(@RequestBody Frequencia frequencia) {
        try {
            return service.save(frequencia);
        } catch (Exception e) {
            return new Frequencia();
        }
    }

    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public Optional<Frequencia> findById(@PathVariable(value = "id")Long id) {
        return service.findById(id);
    }
}
