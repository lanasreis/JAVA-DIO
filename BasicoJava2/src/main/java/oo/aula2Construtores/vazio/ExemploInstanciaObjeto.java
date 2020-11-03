package oo.aula2Construtores.vazio;

public class ExemploInstanciaObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alana");
        System.out.println("Meu nome eh: " + pessoa.getNome());
    }
}
