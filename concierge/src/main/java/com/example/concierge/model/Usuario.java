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
	
	public Usuario (Long cpf, String senha, String nome, Long telefone, Date data_nascimento, 
			String sexo, Long num_rg, String orgao_expedidor, String naturalidade, String nome_mae, String nome_pai, 
			String estado_civil, String rua, String bairro, String complemento, String cidade, String ocupacao,
			Double renda, String escolaridade, String tipo_residencia, String pcdef, String disp_horario) {
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
		this.telefone = telefone;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.num_rg = num_rg;
		this.orgao_expedidor = orgao_expedidor;
		this.naturalidade = naturalidade;
		this.nome_mae = nome_mae;
		this.nome_pai = nome_pai;
		this.estado_civil = estado_civil;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.ocupacao = ocupacao;
		this.renda = renda;
		this.escolaridade = escolaridade;
		this.tipo_residencia = tipo_residencia;
		this.pcdef = pcdef;
		this.disp_horario = disp_horario;
		
	}
	public Usuario (Long id, Long cpf, String senha, String nome, Long telefone, Date data_nascimento, 
			String sexo, Long num_rg, String orgao_expedidor, String naturalidade, String nome_mae, String nome_pai, 
			String estado_civil, String rua, String bairro, String complemento, String cidade, String ocupacao,
			Double renda, String escolaridade, String tipo_residencia, String pcdef, String disp_horario) {
		this.id = id;
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
		this.telefone = telefone;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.num_rg = num_rg;
		this.orgao_expedidor = orgao_expedidor;
		this.naturalidade = naturalidade;
		this.nome_mae = nome_mae;
		this.nome_pai = nome_pai;
		this.estado_civil = estado_civil;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.ocupacao = ocupacao;
		this.renda = renda;
		this.escolaridade = escolaridade;
		this.tipo_residencia = tipo_residencia;
		this.pcdef = pcdef;
		this.disp_horario = disp_horario;
		
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
	
	@Column(name = "telefone")
	private Long telefone;
	
	@Column(name = "data_nascimento")
	private Date data_nascimento;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "num_rg")
	private Long num_rg;
	
	@Column(name = "orgao_expedidor")
	private String orgao_expedidor;
	
	@Column(name = "naturalidade")
	private String naturalidade;
	
	@Column(name = "nome_mae")
	private String nome_mae;
	
	@Column(name = "nome_pai")
	private String nome_pai;
	
	@Column(name = "estado_civil")
	private String estado_civil;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "ocupacao")
	private String ocupacao;
	
	@Column(name = "renda")
	private Double renda;
	
	@Column(name = "escolaridade")
	private String escolaridade;
	
	@Column(name = "tipo_residencia")
	private String tipo_residencia;
	
	@Column(name = "pcdef")
	private String pcdef;
	
	@Column(name = "disp_horario")
	private String disp_horario;

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

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getNum_rg() {
		return num_rg;
	}

	public void setNum_rg(Long num_rg) {
		this.num_rg = num_rg;
	}

	public String getOrgao_expedidor() {
		return orgao_expedidor;
	}

	public void setOrgao_expedidor(String orgao_expedidor) {
		this.orgao_expedidor = orgao_expedidor;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public String getNome_pai() {
		return nome_pai;
	}

	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getTipo_residencia() {
		return tipo_residencia;
	}

	public void setTipo_residencia(String tipo_residencia) {
		this.tipo_residencia = tipo_residencia;
	}

	public String getPcdef() {
		return pcdef;
	}

	public void setPcdef(String pcdef) {
		this.pcdef = pcdef;
	}

	public String getDisp_horario() {
		return disp_horario;
	}

	public void setDisp_horario(String disp_horario) {
		this.disp_horario = disp_horario;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
