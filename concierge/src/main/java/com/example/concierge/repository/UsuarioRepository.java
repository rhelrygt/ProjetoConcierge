package com.example.concierge.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.concierge.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
}
