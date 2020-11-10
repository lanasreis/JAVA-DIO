package List;

import java.util.List;
import java.util.Vector;

public class ListVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Natação");
        esportes.add("Peteca");
        esportes.add("Boliche");
        System.out.println(esportes);

        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Handebol");
        System.out.println(esportes);

        //Remove o esporte da posição 2 do vetor
        esportes.remove(3);
        System.out.println(esportes);

        //Remove o esporte Handebol
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retorna o 1 item do vetor o valor da posição 2 do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte: esportes) {
            System.out.println("--->" + esporte);
        }



    }
}
