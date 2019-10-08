package com.srp.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srp.cursomc.domain.Categoria;
import com.srp.cursomc.repositories.CategoriaRepository;
import com.srp.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		return repo.findById(id).orElseThrow(()->new ObjectNotFoundException("Objeto não"
				+ " encontrado! Id: " + id + ", Tipo " + Categoria.class.getName()));
	}

	public Categoria inclui(Categoria categoria) {
		return repo.save(categoria);
	}

	public Categoria atualizar(Categoria categoria) {
		return repo.save(categoria);
	}

}
