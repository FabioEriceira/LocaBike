package com.dev.locabike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.locabike.model.cadastro.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
