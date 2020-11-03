package oo.aula3.encapsulamento;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alana", 16, 9, 2001);

        System.out.println("Meu nome eh " + pessoa.getNome() + " nasci em " + pessoa.getDataNascimento() + ", logo, tenho " + pessoa.calculaIdade()+ " anos!");
    }
}
