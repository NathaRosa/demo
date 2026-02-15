package com.example.teste.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    
    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "Usuário com ID: " + id;
    }

    @GetMapping
    public String getAllUsers() {
        return "Lista de todos os usuários";
    }

    @PostMapping
    public String createUser(@RequestBody String name) {
        return "Usuário criado: " + name + " criado com sucesso!";
    }
}
