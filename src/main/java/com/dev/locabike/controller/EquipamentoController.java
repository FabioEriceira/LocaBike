package com.dev.locabike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.locabike.model.cadastro.Equipamento;
import com.dev.locabike.repository.EquipamentoRepository;

@RestController
@RequestMapping("/equipamentos") 
public class EquipamentoController {

	@Autowired					
	private EquipamentoRepository equipamentoRepository;
	
	@GetMapping								
	public List<Equipamento> listar(){
		return equipamentoRepository.findAll();	 
	}
	
	@PutMapping								
	public void alterar(@RequestBody Equipamento equipamento){
		equipamentoRepository.save(equipamento);
	}
	
	@PostMapping 				 
	public void gravar(@RequestBody Equipamento equipamento) {  
		equipamentoRepository.save(equipamento); 
	}
				
	@GetMapping("/{id}")								
	public Equipamento buscar(@PathVariable ("id") Integer id){
		return equipamentoRepository.findById(id).orElse(null);	 
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		equipamentoRepository.deleteById(id);
	}
	
}
