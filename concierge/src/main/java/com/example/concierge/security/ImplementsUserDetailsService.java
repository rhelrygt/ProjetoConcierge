package com.example.concierge.security;

import com.example.concierge.model.Usuario;
import com.example.concierge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = ur.findByCpf(Long.parseLong(username));
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }
        return usuario;
    }
}
