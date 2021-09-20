package com.example.concierge.controller;
import com.example.concierge.model.Usuario;
import com.example.concierge.security.AccountCredentials;
import com.example.concierge.service.UsuarioService;
import com.example.concierge.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class LoginController {

    @Autowired
    UsuarioService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserView login(@RequestBody AccountCredentials user) {
        try {
            return service.findByCpf(user);
        } catch (Exception e) {
            return new UserView();
        }
    }

}

