package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.ConvidadosRepository;

@Controller
@RequestMapping(value ="/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadosRepository convidadosRepository;
	
	@GetMapping
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		modelAndView.addObject("convidadosRepository", convidadosRepository.findAll());
		modelAndView.addObject(new Convidado());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		
		this.convidadosRepository.save(convidado);
		
		return "redirect:/convidados";
	}

}
