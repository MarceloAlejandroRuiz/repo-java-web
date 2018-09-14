package com.utn.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utn.bo.Producto;
import com.utn.service.ProductoService;

@Controller
public class ProductController {
	@Autowired
	private ProductoService productoservice;

	// http://localhost:8080/SpringMvcMaven/productos/ver.do

	@RequestMapping(value = "/productos/ver.do", method = RequestMethod.GET)
	public String ver(Model model) {
		Producto producto = productoservice.buscarProducto(1L); 
		model.addAttribute("producto", producto);
		return "/productos/ver";
	}

	//http://localhost:8080/SpringMvcMaven/productos/listar.do
	
	@RequestMapping(value = "/productos/listar.do", method = RequestMethod.GET)
	public String listar(Model model) {
		List<Producto> productos = productoservice.buscarProductos();
		model.addAttribute("productos", productos);
		return null;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String nuevo(Model model) throws Exception{
		return "/productos/guardar"; 
	}
}
