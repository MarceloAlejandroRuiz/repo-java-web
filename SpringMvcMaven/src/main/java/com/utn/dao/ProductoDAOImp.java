package com.utn.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.bo.Producto;

@Repository 
public class ProductoDAOImp implements IProductoDAO {

	@Override
	public Long guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarProductoPorId(Long id) {
		Producto p = new Producto();
		p.setId(id);
		p.setNombre("cartera");
		p.setPrecio(10.2);

		return p;
	}

	@Override
	public List<Producto> recuperarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
