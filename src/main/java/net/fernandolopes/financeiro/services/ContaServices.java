package net.fernandolopes.financeiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fernandolopes.financeiro.domain.Conta;
import net.fernandolopes.financeiro.repository.ContaRepository;
import net.fernandolopes.financeiro.services.exceptions.ObjectNotFoundException;


@Service
public class ContaServices {

	@Autowired
	private ContaRepository repo;
	
	public Conta buscar(Integer id) {
		Conta obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Conta.class.getName());
					
		}
		
		return obj;
	}
	
	
}
