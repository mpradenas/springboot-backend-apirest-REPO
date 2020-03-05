package com.bolsaideas.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.springboot.backend.apirest.models.dao.IClienteDAO;
import com.bolsaideas.springboot.backend.apirest.models.entities.Cliente;


public class iClienteSvcImpl implements IClienteSvc {
	
    IClienteDAO iClienteDao;
    
    @Transactional(readOnly =true)
	@Override
	public Cliente getClienteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		try {
			
			return iClienteDao.findById(id).orElse(null);
				
		} catch (Exception e) {
		  
			throw e;
		}
	}

    @Transactional(readOnly =true)
	@Override
	public List<Cliente> getClientes() throws Exception {
		// TODO Auto-generated method stub
		try {
			
			return iClienteDao.findAll();
					
		} catch (Exception e) {
		   throw e;
		}
	}

}
