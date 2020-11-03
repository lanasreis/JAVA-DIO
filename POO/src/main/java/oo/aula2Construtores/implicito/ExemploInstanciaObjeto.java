package oo.aula2Construtores.implicito;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //construtor implícito

        pessoa.setNome("Alana");
        System.out.println("Meu nome eh: " + pessoa.getNome());
    }
}
