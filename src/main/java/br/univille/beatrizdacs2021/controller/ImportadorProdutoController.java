package br.univille.beatrizdacs2021.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.beatrizdacs2021.model.Fornecedor;
import br.univille.beatrizdacs2021.model.Produto;
import br.univille.beatrizdacs2021.service.FornecedorService;

@Controller
@RequestMapping("/import-produto")
public class ImportadorProdutoController {

    @Autowired
    private FornecedorService fornecedorService;
    
    @GetMapping
    public ModelAndView index(@ModelAttribute Fornecedor fornecedor){

        List<Fornecedor> listaFornecedor = fornecedorService.getAllFornecedores();
        return new ModelAndView("/importproduto/index", "listafornecedor", listaFornecedor);
    }
    @PostMapping
    public ModelAndView busca(Fornecedor fornecedor){
        System.out.println(fornecedor.getNome());
        return new ModelAndView("/importproduto/index");
    }
}
