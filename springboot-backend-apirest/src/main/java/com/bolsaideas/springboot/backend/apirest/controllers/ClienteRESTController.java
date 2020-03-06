package com.bolsaideas.springboot.backend.apirest.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsaideas.springboot.backend.apirest.models.entities.Cliente;
import com.bolsaideas.springboot.backend.apirest.services.IClienteSvc;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRESTController {
	
	@Autowired
	private IClienteSvc iClienteSvc;
	
	
	@GetMapping("/clientes")
	public List<Cliente>findAllClientes(){
		
           try {
			return iClienteSvc.getClientes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
           
	}
	
	
	
	

}
