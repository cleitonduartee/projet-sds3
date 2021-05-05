package com.cleitonduarte.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleitonduarte.dsvendas.dto.SellerDTO;
import com.cleitonduarte.dsvendas.entities.Seller;
import com.cleitonduarte.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> listSeller =  repository.findAll();
		return listSeller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());		 
	}
}
