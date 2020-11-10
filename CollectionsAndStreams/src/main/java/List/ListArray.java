package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alana");
        nomes.add("Vitoria");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        System.out.println(nomes);

        Collections.sort(nomes); //Ordena elementos
        System.out.println(nomes);

        nomes.set(0, "Gustavo"); // Muda eleemnto da posição 0 para Gustavo
        System.out.println(nomes);

        System.out.println(nomes.remove(0)); //Remove elemnto conforme posicao e retorna elemento
        System.out.println(nomes);
        //Gustavo

        System.out.println(nomes.remove("Pedro")); //Remove elemento e retorna true
        System.out.println(nomes);
        //true

        System.out.println(nomes.remove("Alana")); //Remove elemento se existir
        //false

        String nome = nomes.get(2); //Elemento na posição 2
        System.out.println(nome);

        int tamanho = nomes.size(); //Quantidade de elementos
        System.out.println(tamanho);

        System.out.println(nomes.indexOf("Joao")); //Indice de Joao
        System.out.println(nomes.indexOf("Alana")); //Alana não está na lista

        System.out.println(nomes.contains("Vitor")); //Lista contem Vitor? NÂO false
        System.out.println(nomes.contains("Vitoria")); //Lista contem irtoria? SIM retorn true

        for (String nomeDoItem: nomes) { //ForEach
            System.out.println("---->" + nomeDoItem);
        }

        Iterator<String> iterator =  nomes.iterator();

        while (iterator.hasNext()){ //HasNext retorna true se tiver um próximo elemento
            System.out.println("******> " + iterator.next());
        }

        System.out.println(nomes.isEmpty());//Lista vazia? NÃO false
        nomes.clear(); //Limpa Lista
        System.out.println(nomes.isEmpty()); //Lista vazia? SIM true

    }
}
