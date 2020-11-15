package com.group.projetoSpringBoot.rest;

import com.group.projetoSpringBoot.exceptions.JediNotFoundException;
import com.group.projetoSpringBoot.model.Jedi;
import com.group.projetoSpringBoot.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return repository.getAllJedi();
    }

    @GetMapping("api/jedi/{id}")
    public Jedi getJedi(@PathVariable("id") int id) throws JediNotFoundException {
            return repository.getJedi(id);
    }
}
