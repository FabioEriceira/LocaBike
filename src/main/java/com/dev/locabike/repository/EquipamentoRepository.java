package com.dev.locabike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.locabike.model.cadastro.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>{

}
