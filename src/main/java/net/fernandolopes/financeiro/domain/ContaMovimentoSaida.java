package net.fernandolopes.financeiro.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ContaMovimentoSaida  extends Conta {
	private static final long serialVersionUID = 1L;
	
	
	private String nomeSaida;
	private Double valorSaida;
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataMovimentoSaida;
	
	public ContaMovimentoSaida() {
		
	}

	public ContaMovimentoSaida(Integer id, Double saldo, Banco banco,Pessoa pessoa ,Date dataMovimentoSaida, String nomeSaida, Double valorSaida) {
		super(id, saldo, banco, pessoa);
		this.nomeSaida = nomeSaida;
		this.valorSaida = valorSaida;
		this.dataMovimentoSaida = dataMovimentoSaida;
	}

	public String getNomeSaida() {
		return nomeSaida;
	}

	public void setNomeSaida(String nomeSaida) {
		this.nomeSaida = nomeSaida;
	}

	public Double getValorSaida() {
		return valorSaida;
	}

	public void setValorSaida(Double valorSaida) {
		this.valorSaida = valorSaida;
	}

	public Date getDataMovimentoSaida() {
		return dataMovimentoSaida;
	}

	public void setDataMovimentoSaida(Date dataMovimentoSaida) {
		this.dataMovimentoSaida = dataMovimentoSaida;
	}


	
	

}
