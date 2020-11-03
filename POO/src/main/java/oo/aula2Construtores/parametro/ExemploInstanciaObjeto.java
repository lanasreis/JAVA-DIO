package oo.aula2Construtores.parametro;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();     //Erro espera parâmetros
        Pessoa pessoa = new Pessoa("Alana");

        System.out.println("Meu nome eh: " + pessoa.getNome());
        pessoa.setNome("Alana Soares Reis");
        System.out.println("Meu nome agora eh: " + pessoa.getNome());
    }
}
