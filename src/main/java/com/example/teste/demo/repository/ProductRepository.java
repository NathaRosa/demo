package com.example.teste.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.demo.model.Produto;

public interface ProductRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByName(String name);
}
