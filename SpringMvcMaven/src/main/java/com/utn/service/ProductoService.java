package com.utn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.bo.Producto;
import com.utn.dao.ProductoDAOImp;

@Service
public class ProductoService {

	@Autowired
	private ProductoDAOImp productoDAO;
	
	public Producto buscarProducto(Long id) { 
		
		return	productoDAO.buscarProductoPorId(id);
	}

}
