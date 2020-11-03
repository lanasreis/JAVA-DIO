package oo.aula2Construtores.opcional;

public class Pessoa {
    private String nome;

    public Pessoa(){

    }
    public Pessoa(final String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(final String nome){
        this.nome = nome;
    }
}
