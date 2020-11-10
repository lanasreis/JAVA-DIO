package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<ExercicioVeiculo> veiculos = new ArrayList<>();

        veiculos.add(new ExercicioVeiculo("C4 Picasso", "Citroen", 2010, 25000.49));
        veiculos.add(new ExercicioVeiculo("Ford Ka", "Ford", 2015, 40000.60));
        veiculos.add(new ExercicioVeiculo("Onix", "Chevrolet", 2020, 42000.00));
        veiculos.add(new ExercicioVeiculo("Jeep Compass", "Jeep", 2021, 120000.50));
        veiculos.add(new ExercicioVeiculo("Gol", "Volkswagen", 2018, 21000.49));

        System.out.println("<----Ordem De Insercao---->");
        Iterator<ExercicioVeiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Collections.sort(veiculos);
        System.out.println("<----Ordem Crescente De Ano (interface Comparable)---->");
        iterator = veiculos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Collections.sort(veiculos, new ExercicioVeiculoComparator());
        System.out.println("<----Ordem Crescente De Valor (interface Comparator)---->");
        iterator = veiculos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        veiculos.sort((atual, proximo) -> proximo.getAno() - atual.getAno());
        System.out.println("<----Ordem Decrescente De Ano---->");
        iterator = veiculos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
