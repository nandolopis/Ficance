package net.fernandolopes.financeiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fernandolopes.financeiro.domain.Pessoa;
import net.fernandolopes.financeiro.repository.PessoaRepository;
import net.fernandolopes.financeiro.services.exceptions.ObjectNotFoundException;


@Service
public class PessoaServices {

	@Autowired
	private PessoaRepository repo;
	
	public Pessoa buscar(Integer id) {
		Pessoa obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Pessoa.class.getName());
					
		}
		
		return obj;
	}
	
	
}
