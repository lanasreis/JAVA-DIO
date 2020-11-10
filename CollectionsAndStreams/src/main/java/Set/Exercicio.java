package Set;

import java.util.TreeSet;

public class Exercicio {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println("removi primeiro elemento: " + numeros.pollFirst());
        System.out.println(numeros);

        numeros.add(23);

        System.out.println("adicionei 23: " + numeros);

        System.out.println("O tamanho eh: " + numeros.size());

        System.out.println("O set esta vazio? "+ numeros.isEmpty());
        numeros.clear();
        System.out.println("O set esta vazio? "+ numeros.isEmpty());

    }
}
