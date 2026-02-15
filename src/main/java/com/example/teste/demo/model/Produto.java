package com.example.teste.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Double preco;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
