package com.udemy.cursomc.tests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testefinal")
public class FinalTestaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String testeFinal(){
		return "Ultimo teste";
	}

}
