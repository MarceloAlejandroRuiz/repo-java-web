package com.utn.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
	
	@RequestMapping(value="ver.do")
	public String ver(Model model) {
		model.addAttribute("producto","hola");
		return "bienvenida";
	}

}
