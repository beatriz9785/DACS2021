package br.univille.beatrizdacs2021.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.univille.beatrizdacs2021.model.Produto;

@Service
public interface ProdutoService{
    public List<Produto> getAllProdutos();

}