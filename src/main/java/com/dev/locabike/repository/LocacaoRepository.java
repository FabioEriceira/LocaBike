package com.dev.locabike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.locabike.model.locacao.Locacao;

public interface LocacaoRepository extends JpaRepository<Locacao, Integer>{

}
