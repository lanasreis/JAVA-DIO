package oo.exercicio1;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro("C4 Picasso", "Citroen", "ESP-1927", 5);

        carro.adicionarPessoas(3);
        System.out.println("A quantidade atual de pessoas eh: " + carro.qtdDePessoa());

        carro.removerPessoas(4);
        System.out.println("A quantidade atual de pessoas eh: " + carro.qtdDePessoa());

    }
}
