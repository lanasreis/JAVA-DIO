package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercicio {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espirito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");

        System.out.println(estados);

        System.out.println("Removi MG: "+estados.remove("MG"));
        System.out.println(estados);

        estados.put("DF", "Distrito Federal");

        System.out.println("Qtd de estados" + estados.size());

        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println(estados);

        Iterator<String> iterator = estados.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(estados.get(key) + " (" + key + ")");
        }

        System.out.println("Contem o estado SC? "+estados.containsKey("SC"));
        System.out.println("Contem o estado Maranhão? " + estados.containsValue("Maranhão"));
    }
}
