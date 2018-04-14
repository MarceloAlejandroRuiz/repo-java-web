package com.utn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.utn.modelo.Persona;

//@Controller
public class HomeContreller {

	@RequestMapping(value="persona", method = RequestMethod.GET)
	public @ResponseBody Persona ObtenerPersona(@RequestParam(value="id",required=true)int id) {
		Persona p = new Persona();
		p.setApellido("ruiz");
		p.setNombre("marcelo");
		p.setEdad(21);
		return p;
		
	}
}
