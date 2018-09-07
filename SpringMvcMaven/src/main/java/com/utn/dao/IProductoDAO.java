package com.utn.dao;

import java.util.List;

import com.utn.bo.Producto;

public interface IProductoDAO {
	
	public Long guardarProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public void borrarProducto(Long id);
    public Producto buscarProductoPorId(Long id);
    public List<Producto>recuperarProductos();
}
