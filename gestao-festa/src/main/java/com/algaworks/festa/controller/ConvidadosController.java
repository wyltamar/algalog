package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.repository.ConvidadosRepository;

@Controller
@RequestMapping
public class ConvidadosController {
	
	@Autowired
	private ConvidadosRepository convidadosRepository;
	
	@GetMapping(value ="/convidados")
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		modelAndView.addObject("convidadosRepository", convidadosRepository.findAll());
		
		return modelAndView;
	}

}
