package com.utn.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BienvenidaControlador {
	
	
	@RequestMapping(value="saludo.do")
	public String saludar() {
		
		return "bienvenida";
	}

	@RequestMapping(value="datos.do")
	public String datosBle(Model model) {
		
		
		model.addAttribute("nombre","pepito");
		return "datosPersonales";
	}
	
	
}
