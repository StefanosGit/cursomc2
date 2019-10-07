package com.srp.cursomc.domain.enuns;

import java.util.stream.Stream;

import lombok.Getter;

@Getter
public enum EstadoPagamento {
	
	PENDENTE(1 , "Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3,"Cancelado");
	
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public static EstadoPagamento toEnum(Integer cod) {
		return Stream.of(EstadoPagamento.values())
				.filter(tipo -> cod.equals(tipo.getCod())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Código Inválido. Id: " + cod));
	}


}
