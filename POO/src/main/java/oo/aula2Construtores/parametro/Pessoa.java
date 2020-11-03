package oo.aula2Construtores.parametro;

public class Pessoa {
    private String nome;

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
