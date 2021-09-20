package com.example.concierge.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.concierge.model.Aluno;
import com.example.concierge.model.Coordenador;
import com.example.concierge.model.Professor;
import com.example.concierge.repository.CoordenadorRepository;
import com.example.concierge.security.AccountCredentials;
import com.example.concierge.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.concierge.model.Usuario;
import com.example.concierge.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;

	@Autowired
	CoordenadorService serviceCord;

	@Autowired
	ProfessorService serviceProf;

	@Autowired
	AlunoService serviceAlu;
	
	public Usuario save(Usuario usuario) {
		/*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(encodedPassword);*/
		return repository.save(usuario);
	}
	
	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}

	public UserView findByCpf(AccountCredentials cred){
		UserView user = new UserView();
		ArrayList<Coordenador> listCord = new ArrayList<>();
		ArrayList<Professor> listProf = new ArrayList<>();
		ArrayList<Aluno> listAlu = new ArrayList<>();

		listCord = serviceCord.findAll();
		listProf = serviceProf.findAll();
		listAlu = serviceAlu.findAll();
		for(Coordenador co:listCord){
			if( repository.findByCpf(cred.getUsername()).getid()==co.getId_usuario() && cred.getPassword().equals(repository.findByCpf(cred.getUsername()).getSenha())) {
				user.setId(repository.findByCpf(cred.getUsername()).getid());
				user.setNome(repository.findByCpf(cred.getUsername()).getNome());
				user.setPapel("coordenador");
				return user;
			}
		}
		for(Professor pf:listProf){
			if( repository.findByCpf(cred.getUsername()).getid()==pf.getId_usuario() && cred.getPassword().equals(repository.findByCpf(cred.getUsername()).getSenha())) {
				Professor prof = new Professor();
				user.setId(repository.findByCpf(cred.getUsername()).getid()+1);
				user.setNome(repository.findByCpf(cred.getUsername()).getNome());
				user.setPapel("professor");
				return user;
			}
		}
		for(Aluno al:listAlu){
			if( repository.findByCpf(cred.getUsername()).getid()==al.getId_usuario() && cred.getPassword().equals(repository.findByCpf(cred.getUsername()).getSenha())) {
				user.setId(repository.findByCpf(cred.getUsername()).getid());
				user.setNome(repository.findByCpf(cred.getUsername()).getNome());
				user.setPapel("aluno");
				return user;
			}
		}
		return new UserView();

	}
}
