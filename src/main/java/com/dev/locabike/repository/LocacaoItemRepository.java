package com.dev.locabike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.locabike.model.locacao.LocacaoItem;

public interface LocacaoItemRepository extends JpaRepository<LocacaoItem, Integer>{

}
