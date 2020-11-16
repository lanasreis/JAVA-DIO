package com.example.springbootREST.service;

import com.example.springbootREST.controller.request.SoldadoEditRequest;
import com.example.springbootREST.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoldadoService {
    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarSoldados() {
        List<Soldado> soldados = new ArrayList<>();

        Soldado soldado = new Soldado();
        soldado.setCpf("1");
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("1");
        soldado2.setNome("Legolas");
        soldado2.setRaca("Elfo");
        soldado2.setArma("Arco e flecha");

        Soldado soldado3 = new Soldado();
        soldado3.setCpf("1");
        soldado3.setNome("Legolas");
        soldado3.setRaca("Elfo");
        soldado3.setArma("Arco e flecha");

        soldados.add(soldado);
        soldados.add(soldado2);
        soldados.add(soldado3);
        return soldados;
    }
}
