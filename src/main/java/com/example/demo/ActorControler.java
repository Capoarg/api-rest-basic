package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sakila")
public class ActorControler {

    @Autowired
    ActorRepositorio actorRepositorio;

    @GetMapping("/hola")
    public String hola() {
        return "hola";
    }

    @GetMapping("/actors")

    public List<Actor> findAll() {
        return actorRepositorio.findAll();
    }

    @GetMapping("/actors/{id}")
    public Optional<Actor> findById(@PathVariable Integer id) {
        return actorRepositorio.findById(id);
    }

    @PostMapping("/actor")
    public Actor findById(@RequestBody Actor actor) {
        return actorRepositorio.save(actor);
    }
}
