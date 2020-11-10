package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(8.2);
        notasAlunos.add(4.5);
        notasAlunos.add(9.8);
        notasAlunos.add(10.0);
        notasAlunos.add(6.8);
        notasAlunos.add(3.4);
        notasAlunos.add(8.1);

        System.out.println(notasAlunos);

        notasAlunos.remove(5.8);
        System.out.println("Removi 5.8: " + notasAlunos);

        System.out.println("O tamanho do Set eh: " + notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Double nota : notasAlunos){
            System.out.println("-----> " + nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());
    }
}
