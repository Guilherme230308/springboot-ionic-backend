package com.udemy.cursomc.tests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testaRest")
public class TestaResource {
	
	private int valor1 = 3244;
	private int valor2 = 8776;
	private int total;
	
	@RequestMapping(method=RequestMethod.GET)
	private int soma() {
		return valor1 + valor2;
	}
//	@RequestMapping(method=RequestMethod.GET)
//	public String testa() {
//		return "Rest ok";
//	}
}
