package net.fernandolopes.financeiro.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String nome;
	private String cpt_cnpj;
	private String email;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@ElementCollection
	@CollectionTable(name="TELEFONE")
	private Set<String> telefones = new HashSet<>();
	
	
	public Pessoa() {
		
	}


	public Pessoa(Integer id, String nome, String cpt_cnpj, String email, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpt_cnpj = cpt_cnpj;
		this.email = email;
		this.usuario = usuario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpt_cnpj() {
		return cpt_cnpj;
	}


	public void setCpt_cnpj(String cpt_cnpj) {
		this.cpt_cnpj = cpt_cnpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
