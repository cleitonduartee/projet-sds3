package com.cleitonduarte.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleitonduarte.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
