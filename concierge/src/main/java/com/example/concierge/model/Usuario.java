package com.example.concierge.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable, UserDetails {
	public Usuario() {}
	
	public Usuario (Long cpf, String senha, String nome) {
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
	}
	public Usuario (Long id, Long cpf, String senha, String nome) {
		this.id = id;
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
	}
	
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "cpf")
	private Long cpf;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "nome")
	private String nome;

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// metodos utilizados para validar token

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.cpf.toString();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
