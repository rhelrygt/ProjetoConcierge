package com.example.concierge.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ImplementsUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable().authorizeRequests()
                .antMatchers("/home").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers("/usuario/save").permitAll()
                .antMatchers("/historico/save").permitAll()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/aluno/save").permitAll()
                .antMatchers("/professor/save").permitAll()
                .antMatchers("/professor/findAll").permitAll()
                .antMatchers("/coordenador/save").permitAll()
                .antMatchers("/curso/save").permitAll()
                .antMatchers("/curso/list").permitAll()
                .antMatchers("/turma/save").permitAll()
                .antMatchers("/turma/findAll").permitAll()
                .antMatchers("/turma/findbyprofessor/{id}").permitAll()
                .antMatchers("/turma/findbyaluno/{id}").permitAll()
                .antMatchers("/historico/findbyturma/{id}").permitAll()

                .anyRequest().authenticated()
                .and()
                // filtra requisições de login
                .addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
                UsernamePasswordAuthenticationFilter.class)
                // filtra outras requisições para verificar a presença do JWT no header
                .addFilterBefore(new JWTAuthenticationFilter(),
                UsernamePasswordAuthenticationFilter.class);
        httpSecurity.cors();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        //cria uma conta default
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
