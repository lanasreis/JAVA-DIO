package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "Sao Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println("Primeira capital: " + treeCapitais.firstKey());
        System.out.println("Ultima capital: " + treeCapitais.lastKey());

        System.out.println("Capital abaixo de Curitiba capital: " + treeCapitais.lowerKey("PR"));
        System.out.println("Capital acima de Curitiba capital: " + treeCapitais.higherKey("PR"));

        System.out.println("Primeira capital no topo - (" + treeCapitais.firstEntry().getKey() + ") - " + treeCapitais.firstEntry().getValue());

        System.out.println("ultima capital - (" + treeCapitais.lastEntry().getKey() + ") - " + treeCapitais.lastEntry().getValue());

        System.out.println("Retirando primeiro elemento: " +  treeCapitais.pollFirstEntry());
        System.out.println("Retirando ultimo elemento: " + treeCapitais.pollLastEntry());
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()){
            System.out.println("(" + capital + ") - " + treeCapitais.get(capital));
        }
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println("---[" + capital.getKey() + "] ----- " + capital.getValue());
        }
    }
}
