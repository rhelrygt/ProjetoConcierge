package com.example.concierge.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.concierge.model.Usuario;
import com.example.concierge.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public Usuario save(Usuario usuario) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(encodedPassword);
		return repository.save(usuario);
	}
	
	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}
}
