package com.example.concierge.controller;


import java.util.Date;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.HttpResource;

import com.example.concierge.model.Usuario;
import com.example.concierge.repository.UsuarioRepository;
import com.example.concierge.service.UsuarioService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {
	private Long cpf = (long) 123456789;
	private Date nasc = new Date();
	@Autowired
	UsuarioService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario save(@RequestBody Usuario usuario) {
		try {
			System.out.println("deu bom!");
			return service.save(usuario);
			
		} catch (Exception e) {
			System.out.println("deu ruim!");
			return new Usuario();
		}
		
	}
	
	@RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
	public Optional<Usuario> findById(@PathVariable(value = "id")Long id) {
		return service.findById(id);	
	}
	
	
	
	
}
