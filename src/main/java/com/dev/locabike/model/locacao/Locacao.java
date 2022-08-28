package com.dev.locabike.model.locacao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

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
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column (name="data_retirada")
	private LocalDate dataRetirada;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
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
