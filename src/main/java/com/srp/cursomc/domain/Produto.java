package com.srp.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter 
@NoArgsConstructor
@Entity
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Double preco;
	
	
	/*
	 * Como se trata de um mapeamento muitos p/ muitos, será criado uma tabela intermediária,
	 * com os ids do relacionamento. abaixo estamos mapeando o nome da tabela intermediária
	 * PRODUTO_CATEGORIA e o nome dos campos desta produto_id e categoria_id
	 */
	@ManyToMany
	@JoinTable(name="PRODUTO_CATEGORIA",
			joinColumns = @JoinColumn(name="produto_id"),
			inverseJoinColumns = @JoinColumn(name="categoria_id"))
	private List<Categoria> categorias = new ArrayList<>();
	
	
	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	

}
