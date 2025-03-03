package com.primeiroprojeto.produtosapi.controller;

import com.primeiroprojeto.produtosapi.model.Produto;
import com.primeiroprojeto.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/<id>")
    public Produto obterProduto(String id){
//        Optional<Produto> byId = produtoRepository.findById(id);
//        return byId.isPresent() ? byId.get() : null;

        return produtoRepository.findById(id).orElse(null);
    }

}
