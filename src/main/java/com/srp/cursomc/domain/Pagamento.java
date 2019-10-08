package com.srp.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.srp.cursomc.domain.enuns.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter 
@NoArgsConstructor
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Nesse mapeamento de dependencia o sistema vai criar no banco um tabelão com todos os campos
//da tabela mãe e das filhas
//já o mapeamento abaixo cria uma tabela para mãe e uma tabela para cada filha
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	private Integer estado;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private Pedido pedido;

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado.getCod();
		this.pedido = pedido;
	}
	
	
	public EstadoPagamento getEstado() {
		return EstadoPagamento.toEnum(this.estado);
	}
	
	public void setEstado(EstadoPagamento estadoPagamento) {
		this.estado = estadoPagamento.getCod();
	}
	
	

}
