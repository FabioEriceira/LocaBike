package com.dev.locabike.model.locacao.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LocacaoListagem {
	private Integer locacaoid;
	// private BigDecimal subtotal;
	private String cliente;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date devolucao;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date retirada;
	
	private Double valor;
}

	