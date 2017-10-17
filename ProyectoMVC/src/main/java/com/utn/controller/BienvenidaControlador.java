package com.utn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BienvenidaControlador {
	
	@RequestMapping(value="saludo.do")
	public String saludar() {
		
		return "bienvenida"; 
	}

}
