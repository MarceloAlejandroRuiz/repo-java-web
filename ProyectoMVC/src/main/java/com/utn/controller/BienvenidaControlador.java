package com.utn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.utn.modelo.Persona;

@RestController
@RequestMapping("/service/greeting")
public class BienvenidaControlador {
	
	//http://localhost:8080/ProyectoMVC/service/greeting/marce
	/*
	@RequestMapping(value="/{name}",method=RequestMethod.GET)
	public String getGreeting(@PathVariable String name){
		String result="Hello "+name;
		return result;
		} 
	*/	
	
	//@RequestMapping(value="/persona",method=RequestMethod.GET,headers = {"Accept=text/xml, application/json"})
	@RequestMapping(value="/persona",method=RequestMethod.GET)
	public  @ResponseBody Persona ObtenerPersona() {
		Persona p = new Persona();
		p.setApellido("ruiz");
		p.setNombre("marcelo");
		p.setEdad(23);
		return  p;
	}
	
	
	@RequestMapping(value="saludo.do")
	public String saludar() {
		
		return "bienvenida"; 
	}
	
	
	
}
