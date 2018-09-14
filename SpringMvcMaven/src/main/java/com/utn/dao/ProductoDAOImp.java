package com.utn.dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.utn.bo.Producto;

@Repository 
public class ProductoDAOImp implements IProductoDAO {
	protected static Logger logger = Logger.getLogger("ProductoDAOImp");
	private List<Producto> productos = new ArrayList<Producto>();

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
		logger.debug("recuperarProductos");
		
        Producto p1 = new Producto();
        p1.setId(1L);
        p1.setNombre("Bolso");
        p1.setPrecio(11.11);
        
        Producto p2 = new Producto();
        p2.setId(2L);
        p2.setNombre("Cartera");
        p2.setPrecio(10.03);
		
		productos.add(p1);
		productos.add(p2);
		
		return productos;
	}

}
