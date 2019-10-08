package com.srp.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.srp.cursomc.domain.enuns.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
@Entity
public class PagamentoComBoleto extends Pagamento{
	

	private static final long serialVersionUID = 1L;
	
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	
}