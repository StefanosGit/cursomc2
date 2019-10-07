package com.srp.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srp.cursomc.domain.Cliente;
import com.srp.cursomc.repositories.ClienteRepository;
import com.srp.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		return repo.findById(id).orElseThrow(()->new ObjectNotFoundException("Objeto não"
				+ " encontrado! Id: " + id + ", Tipo " + Cliente.class.getName()));
	}

}
