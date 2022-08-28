package com.dev.locabike.model.locacao.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LocacaoListagem2 {

	private Integer locacaoId;
	private String tipoequip;
	private String grupo;
	private BigDecimal valor;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date retirada;
}
