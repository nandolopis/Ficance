package net.fernandolopes.financeiro.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ContaMovimentoEntrada extends Conta {
	private static final long serialVersionUID = 1L;
	
	private String nomeEntrada;
	private Double valorEntrada;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataMovimentoEntrada;
	
	
	public ContaMovimentoEntrada() {
	}
	
	public ContaMovimentoEntrada(Integer id, Double saldo, Banco banco, Pessoa pessoa ,String nomeEntrada,Double valorEntrada,Date dataMovimentoEntrada ) {
		super(id, saldo, banco, pessoa);
		this.nomeEntrada = nomeEntrada;
		this.valorEntrada = valorEntrada;
		this.dataMovimentoEntrada = dataMovimentoEntrada;
	}

	public String getNomeEntrada() {
		return nomeEntrada;
	}

	public void setNomeEntrada(String nomeEntrada) {
		this.nomeEntrada = nomeEntrada;
	}

	public Double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public Date getDataMovimentoEntrada() {
		return dataMovimentoEntrada;
	}

	public void setDataMovimentoEntrada(Date dataMovimentoEntrada) {
		this.dataMovimentoEntrada = dataMovimentoEntrada;
	}


		


}
