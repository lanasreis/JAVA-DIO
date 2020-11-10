package List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes = new Vector<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.set(2, "Roberto");
        System.out.println("Mudei Carlos" + nomes);

        System.out.println("Pos 1 - " + nomes.get(1));

        nomes.remove(4);
        System.out.println("Removi elemento 4 " + nomes);

        nomes.remove("Joao");
        System.out.println("Removi elemento Joao " + nomes);

        System.out.println("O temanho da minha lista eh: " + nomes.size());

        if(nomes.contains("Juliano")){
            System.out.println("Juliano esta na lista: " + nomes.contains("Juliano"));
        }
        else{
            System.out.println("Juliano NAO esta na lista: " + nomes.contains("Juliano"));
        }

        List<String> novosNomes = new Vector<>();

        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);
        System.out.println("Adicionei novos nomes: " + nomes);

        Collections.sort(nomes);
        System.out.println(nomes);


        if(nomes.isEmpty()){
            System.out.println("A lista esta vazia: " + nomes.isEmpty());
        }
        else{
            System.out.println("A lista NAO esta vazia: " + nomes.isEmpty());
        }


    }
}
