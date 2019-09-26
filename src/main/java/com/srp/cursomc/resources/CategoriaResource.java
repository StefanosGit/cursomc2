package com.srp.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srp.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria();
		Categoria cat2 = new Categoria();
		cat1.setId(1);
		cat1.setNome("Informática");
		cat2.setId(2);
		cat2.setNome("Papelaria");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;
	}
}
