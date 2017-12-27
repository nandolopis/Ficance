package net.fernandolopes.financeiro.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String argencia;
	
	@OneToMany(mappedBy="banco")
	private List<Conta> conta = new ArrayList<>();
	
	public Banco() {
		
	}


	public Banco(Integer id, String nome, String argencia) {
		super();
		this.id = id;
		this.nome = nome;
		this.argencia = argencia;
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

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getArgencia() {
		return argencia;
	}


	public void setArgencia(String argencia) {
		this.argencia = argencia;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
