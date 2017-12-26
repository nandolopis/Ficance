package net.fernandolopes.financeiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fernandolopes.financeiro.domain.Usuario;
import net.fernandolopes.financeiro.repository.UsuarioRepository;
import net.fernandolopes.financeiro.services.exceptions.ObjectNotFoundException;


@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario buscar(Integer id) {
		Usuario obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Usuario.class.getName());
					
		}
		
		return obj;
	}
	
	
}
