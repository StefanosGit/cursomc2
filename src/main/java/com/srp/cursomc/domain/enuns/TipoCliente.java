package com.srp.cursomc.domain.enuns;

import java.util.stream.Stream;

public enum TipoCliente {

	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		return Stream.of(TipoCliente.values())
				.filter(tipo -> cod.equals(tipo.getCod())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Código Inválido. Id: " + cod));
	}
	
	
	
	
}
