package com.dev.locabike.model.locacao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="locacao_id")
	private Integer locacaoId;
	
    @DateTimeFormat(pattern="dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column (name="data_retirada")
	private LocalDate dataRetirada;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column (name="data_devolucao")
	private LocalDate dataDevolucao;
	
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	
	@Column (name="valor_final")
	private Double valorFinal;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "locacao_id")
	private List<LocacaoItem> itens;
}
