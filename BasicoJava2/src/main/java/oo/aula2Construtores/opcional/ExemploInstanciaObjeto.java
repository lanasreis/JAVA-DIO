package oo.aula2Construtores.opcional;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoaCompleta = new Pessoa();
        Pessoa pessoa = new Pessoa("Alana");

        System.out.println("Meu nome eh: " + pessoa.getNome());
        pessoaCompleta.setNome(pessoa.getNome() + " Soares Reis");
        System.out.println("Meu nome completo eh: " + pessoaCompleta.getNome());
    }
}
