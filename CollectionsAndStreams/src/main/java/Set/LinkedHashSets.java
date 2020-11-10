package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(18);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(12);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);
        System.out.println("Remove 4: "+sequenciaNumerica);

        System.out.println("O tamanho eh: " + sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer inteiro : sequenciaNumerica){
            System.out.println("---->" + inteiro);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
