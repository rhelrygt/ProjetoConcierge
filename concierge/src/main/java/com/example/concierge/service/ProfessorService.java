package com.example.concierge.service;

import com.example.concierge.model.Professor;
import com.example.concierge.model.Usuario;
import com.example.concierge.repository.ProfessorRepository;
import com.example.concierge.view.ProfessorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    UsuarioService userService;

    @Autowired
    ProfessorRepository repository;

    public ProfessorView save(ProfessorView professor){
        Usuario user = new Usuario();
        if(professor.getId_usuario() != null){
            user.setid(professor.getId_usuario());
        }
        user.setNome(professor.getNome());
        user.setSenha(professor.getSenha());
        user.setCpf(professor.getCpf());
        professor.setId_usuario(userService.save(user).getid());

        Professor prof = new Professor();
        if(professor.getId() != null){
            prof.setId(professor.getId());
        }
        prof.setEspecialidade(professor.getEspecialidade());
        prof.setCurso_superior(professor.getCurso_superior());
        prof.setId_usuario(professor.getId_usuario());
        repository.save(prof);
        return professor;
    }

    public Optional<Professor> findById(Long id) {
        return repository.findById(id);
    }
}
