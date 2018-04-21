package com.udemy.cursomc.tests;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "teste2")
public class TestaResource2 {

	private String rest = "Rest";
	private String funcionando = " funcionando";

	@RequestMapping(method=RequestMethod.GET)
	public String mensagem() {
		return rest + funcionando;

	}
}
