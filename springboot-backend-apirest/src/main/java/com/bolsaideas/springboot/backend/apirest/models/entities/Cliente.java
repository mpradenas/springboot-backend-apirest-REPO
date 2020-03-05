package com.bolsaideas.springboot.backend.apirest.models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente implements Serializable{
     
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long Id;
	
    @Column(name="nombre")
	public String nombre;
    
    @Column(name="apellido")
	public String apellido;
    
    @Column(name="email")
    public String email;
    
	@Column(name="createAt")
	public Date createAt;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
