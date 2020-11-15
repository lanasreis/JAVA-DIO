package com.group.projetoSpringBoot.rest;

import com.group.projetoSpringBoot.exceptions.JediNotFoundException;
import com.group.projetoSpringBoot.model.Jedi;
import com.group.projetoSpringBoot.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return repository.getAllJedi();
        //status code 200
    }

    @GetMapping("api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable("id") int id) throws JediNotFoundException {
        Optional<Jedi> jedi = Optional.ofNullable(repository.getJedi(id));

        if(jedi.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(repository.getJedi(id));
    }

    @PostMapping("/api/jedi")
    public Jedi createJedi(@RequestBody Jedi jedi){
        return repository.add(jedi);
    }

    /*
    @PutMapping("api/jedi/{id}")
    public Jedi updateJedi(@PathVariable("id") int id, @RequestBody Jedi jedi) throws JediNotFoundException {
        if(this.getJedi(id).hasBody()){

        }
    }*/
    /*
    @DeleteMapping("api/jedi/{id}")
    public ResponseEntity<Jedi> delete(@PathVariable("id") int id){

    }*/
}
