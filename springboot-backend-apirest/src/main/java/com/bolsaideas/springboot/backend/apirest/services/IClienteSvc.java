package com.bolsaideas.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.entities.Cliente;


public interface IClienteSvc {
    
	public Cliente getClienteById(Long id) throws Exception;
	public List<Cliente>getClientes()throws Exception;
	
}
