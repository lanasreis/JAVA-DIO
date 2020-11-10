package StremAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Alana");
        estudantes.add("Igor");
        estudantes.add("Amanda");
        estudantes.add("Adriano");
        estudantes.add("Denise");
        estudantes.add("Gustavo");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Elemento com mais letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Elemento com menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Elementos com letra R: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coelção com a qtd de letras: " + estudantes.stream().map(estudante ->
                estudante.concat((" - ").concat(String.valueOf(estudante.length())))).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elemento pelo foreach: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Retorna true se todos elementos possuem a no nome: " + estudantes.stream().allMatch(((elemento) ->
                elemento.contains("a"))));

        System.out.println("Retorna true se alguns elementos possuem a no nome: " + estudantes.stream().anyMatch(((elemento) ->
                elemento.contains("a"))));

        System.out.println("Retorna true se nenhum elemento possui x no nome: " + estudantes.stream().noneMatch((elemento)->
                elemento.contains("x")));

        System.out.println("Primeiro elemento d coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                    .peek(System.out::println)
                    .map(estudante ->
                            estudante.concat((" - ").concat(String.valueOf(estudante.length()))))
                    .peek(System.out::println)
                    .filter((estudante) ->
                            estudante.toLowerCase().contains("a"))
//                    .collect(Collectors.toList()));
//                    .collect(Collectors.joining(", ")));
//                    .collect(Collectors.toSet()));
                    .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));
    }
}
