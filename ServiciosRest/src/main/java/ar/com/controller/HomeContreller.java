package ar.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.com.modelo.Persona;


public class HomeContreller {

	@RequestMapping(value="Persona", method = RequestMethod.GET)
	public @ResponseBody Persona ObtenerPersona()
}
