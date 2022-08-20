package com.dev.locabike.model.locacao.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LocacaoListagem2 {

	private Integer locacaoId;
	private String tipoequip;
	private String grupo;
	private java.math.BigDecimal valor;
	private java.sql.Date retirada;
}
