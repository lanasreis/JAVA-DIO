package oo.aula1Paradigma;

public class Pessoa {
    public String nome = "Marcos";

    public String getNome(){
        return nome;
    }

    public String falarMeuNome(){
        return "Olá, meu nome é " + getNome();
    }
}
