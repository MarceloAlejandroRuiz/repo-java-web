package com.utn.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.utn.bo.Producto;
import com.utn.dao.ProductoDAOImp;

@Service
@Transactional
public class ProductoService {
	protected static Logger logger = Logger.getLogger("service");

	@Autowired
	private ProductoDAOImp productoDAO;
	
	public Producto buscarProducto(Long id) { 
		return	productoDAO.buscarProductoPorId(id);
	}
	
	public List<Producto>buscarProductos(){
		return productoDAO.recuperarProductos();
		
	}

}
