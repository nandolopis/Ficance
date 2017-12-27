package net.fernandolopes.financeiro.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private Double saldo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="banco_id")
	private Banco banco;
	
	
	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	public Conta() {
	}

	
	public Conta(Integer id, Double saldo, Banco banco, Pessoa pessoa) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.banco = banco;
		this.pessoa = pessoa;
		
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
