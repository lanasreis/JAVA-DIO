package com.group.projetoSpringBoot.repository;

import com.group.projetoSpringBoot.exceptions.JediNotFoundException;
import com.group.projetoSpringBoot.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public JediRepository() {
        this.jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi(){
        return this.jedi;
    }

    public Jedi add(final Jedi jedi) {

        this.jedi.add(jedi);

        return jedi;
    }


    public Jedi getJedi(int pos) throws JediNotFoundException {
        return jedi.get(pos);
    }
}
