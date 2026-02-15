package com.example.teste.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.demo.model.Produto;
import com.example.teste.demo.service.ProductService;

@RestController
@RequestMapping("/api/produtos")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) {
        return productService.buscarPorId(id);
    }

    @PostMapping()
    public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(productService.salvarProduto(produto));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Produto>> getProdutosPorNome(@RequestParam String name) {
        return ResponseEntity.ok(productService.buscarPorNomeProduto(name));
    }
}
