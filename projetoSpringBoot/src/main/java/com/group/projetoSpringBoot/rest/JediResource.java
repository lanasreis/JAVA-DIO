package com.group.projetoSpringBoot.rest;

import com.group.projetoSpringBoot.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;



}
