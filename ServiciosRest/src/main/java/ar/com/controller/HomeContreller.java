package ar.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.modelo.Persona;

@RestController
@RequestMapping("/service/greeting")
public class HomeContreller {

	@RequestMapping(value="/persona",method=RequestMethod.GET)
	public  @ResponseBody Persona ObtenerPersona() {
		Persona p = new Persona();
		p.setApellido("ruiz");
		p.setNombre("marcelo");
		p.setEdad(23);
		return  p;
	}
}
