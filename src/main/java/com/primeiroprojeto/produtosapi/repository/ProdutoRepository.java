package com.primeiroprojeto.produtosapi.repository;

import com.primeiroprojeto.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
