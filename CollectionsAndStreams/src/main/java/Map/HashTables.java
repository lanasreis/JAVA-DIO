package Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println("MAP: " + estudantes);

        estudantes.put("Pedro", 55);
        System.out.println("MAP: " + estudantes);

        System.out.println("Remove elemento indice Pedro: " + estudantes.remove("Pedro"));
        System.out.println("MAP: " + estudantes);

        System.out.println("Idade de Mariana: " + estudantes.get("Mariana"));

        System.out.println("Qtd de estudantes: " + estudantes.size());

        for (Map.Entry<String, Integer> estudante: estudantes.entrySet()){
            System.out.println("(" + estudante.getKey() + ") - " + estudante.getValue());
        }
        for (String key : estudantes.keySet()){
            System.out.println("----[" + key + "]----" + estudantes.get(key));
        }

        System.out.println(estudantes);
        estudantes.clear();
        System.out.println(estudantes.isEmpty());
    }
}
