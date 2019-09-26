package com.srp.cursomc.domain;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Categoria implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	
	//@Setter(AccessLevel.PACKAGE)
	private Integer id;
	private String nome;

}
