package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> campeosMundiaisFifa = new HashMap<>();

        campeosMundiaisFifa.put("Brasil", 5);
        campeosMundiaisFifa.put("Alemanha", 4);
        campeosMundiaisFifa.put("Itália", 4);
        campeosMundiaisFifa.put("Uruguai", 2);
        campeosMundiaisFifa.put("Argentina", 2);
        campeosMundiaisFifa.put("França", 2);
        campeosMundiaisFifa.put("Inglaterra", 1);
        campeosMundiaisFifa.put("Espanha", 1);

        System.out.println(campeosMundiaisFifa);

        campeosMundiaisFifa.put("Brasil", 6); //atualiza valor da chave

        System.out.println(campeosMundiaisFifa);

        System.out.println("Qual a qtd da Argentina? " + campeosMundiaisFifa.get("Argentina"));

        System.out.println("Existe chave França? "+ campeosMundiaisFifa.containsKey("França"));
        campeosMundiaisFifa.remove("França");
        System.out.println("Existe chave França? "+ campeosMundiaisFifa.containsKey("França"));


        System.out.println("Existe campeo hexa? " + campeosMundiaisFifa.containsValue(6));
        System.out.println("Existe campeo tree? " + campeosMundiaisFifa.containsValue(3));

        System.out.println("Quantidade de campeões: " + campeosMundiaisFifa.size());

        for (String key : campeosMundiaisFifa.keySet()){
            System.out.println(key + " --- " + campeosMundiaisFifa.get(key));
        }

        for (Map.Entry<String, Integer> entry : campeosMundiaisFifa.entrySet()){
            System.out.println("<" + entry.getKey() +"> -" + entry.getValue());
        }

        campeosMundiaisFifa.clear();
        System.out.println("Esta vazio? " + campeosMundiaisFifa.isEmpty());
    }
}
