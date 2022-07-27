package com.dev.locabike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.locabike.model.cadastro.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

	
}
