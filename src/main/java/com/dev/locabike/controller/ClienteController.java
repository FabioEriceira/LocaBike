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

import com.dev.locabike.model.cadastro.Cliente;
import com.dev.locabike.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes") 
public class ClienteController {

	@Autowired								
	private ClienteRepository clienteRepository;
	
	@GetMapping									
	public List<Cliente> listar(){
		return clienteRepository.findAll();		 
	}

	@PutMapping								
	public void alterar(@RequestBody Cliente cliente){
		clienteRepository.save(cliente); 
	}
	
	@PostMapping 										 
	public void gravar(@RequestBody Cliente cliente) {  
		clienteRepository.save(cliente); 
	}
	
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		clienteRepository.deleteById(id);
	}
	
	
	@GetMapping("/{id}")								
	public Cliente buscar(@PathVariable ("id") Integer id){
		return clienteRepository.findById(id).orElse(null);	 
	}
	

}
