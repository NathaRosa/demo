package com.example.teste.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.teste.demo.model.Produto;
import com.example.teste.demo.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository  productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Produto buscarPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Produto salvarProduto(Produto produto) {
        return productRepository.save(produto);
    }

    public List<Produto> buscarPorNomeProduto(String nomeProduto) {
        return productRepository.findByName(nomeProduto);
    }
}
