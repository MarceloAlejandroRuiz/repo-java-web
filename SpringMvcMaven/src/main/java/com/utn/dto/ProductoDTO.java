package com.utn.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import com.sun.istack.NotNull;

public class ProductoDTO {

private Long id;
	//Usa hibernate-entitymanayer-3.3.1.ga
	
	@NotEmpty
	@Size(min = 3, max = 50)
	private String nombre;
	
	@NotNull
	@Digits(integer = 8, fraction = 2)
	private Double precio;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
