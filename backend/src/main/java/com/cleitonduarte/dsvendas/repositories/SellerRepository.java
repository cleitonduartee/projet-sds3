package com.cleitonduarte.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleitonduarte.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
