package com.bolsaideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolsaideas.springboot.backend.apirest.models.entities.Cliente;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente,Long> {
	
	

}
