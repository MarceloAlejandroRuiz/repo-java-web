package ar.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.modelo.Persona;

@RestController
@RequestMapping("/service/greeting")
public class HomeContreller {

	// solo respuesta, "@ResponseBody", devolvemos algo en formato JSON.
    //http://localhost:8080/ServiciosRest/service/greeting/persona
	@RequestMapping(value = "/persona", method = RequestMethod.GET)
	public @ResponseBody Persona ObtenerPersona() {
		Persona p = new Persona();
		p.setApellido("ruiz");
		p.setNombre("marcelo");
		p.setEdad(23);
		return p;
	}

	// Recibimos datos en formato JSON "@RequestBody" y devolvemos un json,
	// serializamos el objeto.

	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public ResponseEntity<Persona> setClient(@RequestBody Persona persona, HttpServletRequest request) {
		try {
			persona.setApellido(persona.getApellido());
			persona.setNombre(persona.getNombre());
			persona.setEdad(persona.getEdad());

			return ResponseEntity.status(HttpStatus.OK).body(persona);
		} catch (Exception e) {
			// logger.error(e.getMessage());
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(persona);
		}
	}
	
}
