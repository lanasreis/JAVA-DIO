package Comparators;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Estudantes> estudantes = new ArrayList<>();

        estudantes.add(new Estudantes("Alana", 19));
        estudantes.add(new Estudantes("Vitoria", 33));
        estudantes.add(new Estudantes("Eduardo", 21));
        estudantes.add(new Estudantes("Gustavo", 21));
        estudantes.add(new Estudantes("Otavio", 13));
        estudantes.add(new Estudantes("Filó", 16));
        estudantes.add(new Estudantes("Igor", 24));

        System.out.println("<----Ordem De Insercao---->");
        Iterator<Estudantes> iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        estudantes.sort((atual, proximo) -> atual.getIdade() - proximo.getIdade());
        System.out.println("<----Ordem Crescente de Idade---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        estudantes.sort((atual, proximo) -> proximo.getIdade() -  atual.getIdade());
        System.out.println("<----Ordem Decrescente de Idade---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        estudantes.sort(Comparator.comparingInt(Estudantes::getIdade));
        System.out.println("<----Ordem Crescente de Idade (method Reference)---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        estudantes.sort(Comparator.comparingInt(Estudantes::getIdade).reversed());
        System.out.println("<----Ordem Decrescente de Idade (method Reference)---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Collections.sort(estudantes);
        System.out.println("<----Ordem Crescente de Idade (interface Comparable)---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Collections.sort(estudantes, new EstudantesComparator());
        System.out.println("<----Ordem Decrescente de Idade (interface Comparator)---->");
        iterator = estudantes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
