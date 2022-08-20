package com.dev.locabike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.locabike.model.locacao.Locacao;
import com.dev.locabike.model.locacao.dto.LocacaoListagem;
import com.dev.locabike.model.locacao.dto.LocacaoListagem2;
import com.dev.locabike.repository.LocacaoCustomRepository;
import com.dev.locabike.repository.LocacaoRepository;
import com.dev.locabike.service.LocacaoService;

@RestController
@RequestMapping("/locacoes") 
public class LocacaoController {

	@Autowired						
	private LocacaoRepository locacaoRepository;
	
	@Autowired
	private LocacaoService locacaoService;
	
	@Autowired
	private LocacaoCustomRepository customRepository;
	
	
	@PostMapping
	public void calcularLocacao(@RequestBody Locacao locacao) {
		locacaoService.calcularLocacao(locacao);
	}

	@GetMapping								
	public List<Locacao> listar(){
		return locacaoRepository.findAll(); 
	}
	
	@GetMapping("/{id}")								
	public Locacao buscar(@PathVariable ("id") Integer locacaoId){
		return locacaoRepository.findById(locacaoId).orElse(null);	 
	}
	
	@GetMapping("/locacao")
	public List<LocacaoListagem> listLocacaoComCliente() {
		return customRepository.listLocacaoComCliente();
	}
	
	@GetMapping("/{id}/detalhes")								
	public List<LocacaoListagem2> buscarLocalizacaoDetalhe(@PathVariable ("id") Integer itemId){
		return customRepository.listarLocacaoDetalhes(itemId);	 
	}
}
