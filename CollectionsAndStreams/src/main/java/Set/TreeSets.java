package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println("Primeiro elemento: " + treeCapitais.first());

        System.out.println("Ultimo elemento: " + treeCapitais.last());

        System.out.println("Elemento apos Florianópolis " + treeCapitais.lower("florianópolis"));

        System.out.println("Elemento esta acima de Florianopolis " + treeCapitais.higher("florianópolis"));

        System.out.println("Primeiro elemento removendo: " + treeCapitais.pollFirst());
        System.out.println("Set: " + treeCapitais);

        System.out.println("Ultimo elemento removendo: " + treeCapitais.pollLast());
        System.out.println("Set: " + treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String capital : treeCapitais){
            System.out.println("---->" + capital);
        }


        treeCapitais.clear();
        System.out.println(treeCapitais.isEmpty()  );
    }
}
