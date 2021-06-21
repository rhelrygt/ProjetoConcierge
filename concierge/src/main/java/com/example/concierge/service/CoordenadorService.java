package com.example.concierge.service;

import com.example.concierge.model.Coordenador;
import com.example.concierge.model.Usuario;
import com.example.concierge.repository.CoordenadorRepository;
import com.example.concierge.view.CoordenadorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoordenadorService {

    @Autowired
    UsuarioService userService;

    @Autowired
    CoordenadorRepository repository;

    public CoordenadorView save(CoordenadorView coordenador){
        Usuario user = new Usuario();
        if(coordenador.getId_usuario() != null){
            user.setid(coordenador.getId_usuario());
        }
        user.setNome(coordenador.getNome());
        user.setSenha(coordenador.getSenha());
        user.setCpf(coordenador.getCpf());
        coordenador.setId_usuario(userService.save(user).getid());

        Coordenador cord = new Coordenador();
        if(coordenador.getId() != null){
            cord.setId(coordenador.getId());
        }
        cord.setSecretaria(coordenador.getSecretaria());
        cord.setId_usuario(coordenador.getId_usuario());
        repository.save(cord);

        return coordenador;
    }

    public Optional<Coordenador> findById(Long id) {
        return repository.findById(id);
    }
}
