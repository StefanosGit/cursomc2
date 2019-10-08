package com.srp.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srp.cursomc.domain.Pedido;
import com.srp.cursomc.repositories.PedidoRepository;
import com.srp.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		return repo.findById(id).orElseThrow(()->new ObjectNotFoundException("Objeto não"
				+ " encontrado! Id: " + id + ", Tipo " + Pedido.class.getName()));
	}

}
