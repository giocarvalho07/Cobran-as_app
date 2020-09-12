package com.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cobranca.model.Cobranca;
import com.cobranca.model.StatusTitulo;
import com.cobranca.repository.Cobrancas;

@Controller
@RequestMapping("/titulo")
public class CobrancaContoller {
	
	@Autowired
	private Cobrancas cobrancas;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastro");
		mv.addObject("statusTitulo", StatusTitulo.values());
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Cobranca cobranca) {
		cobrancas.save(cobranca);
		ModelAndView mv = new ModelAndView("cadastro");
		mv.addObject("statusTitulo", StatusTitulo.values());
		mv.addObject("mensagem", "Cobrança salva com sucesso !");
		return mv;
	}
}
