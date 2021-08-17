package br.univille.beatrizdacs2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.beatrizdacs2021.model.Fornecedor;
import br.univille.beatrizdacs2021.service.FornecedorService;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {
    
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ModelAndView index(){

      //  List<Fornecedor> listaFornecedores = service.getAllFornecedores();

        return new ModelAndView("fornecedor/index");

    }
    @GetMapping("/novo")
    public ModelAndView novo(){


      return new ModelAndView("fornecedor/novo");
    }
    
}