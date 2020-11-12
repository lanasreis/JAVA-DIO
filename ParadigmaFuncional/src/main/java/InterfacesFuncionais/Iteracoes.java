package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    /*

    */
    public static void main(String[] args) {
        String[] nomes = {"Alana", "Amanda", "Denise", "Adriano"};
        Integer[] numeros = {1,2,3,4,5};
//        imprimirNomesFiltrados(nomes);
//        todosOsNomes(nomes);
//        imprimirDobro(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Dentista");
        profissoes.add("Gerente");
        profissoes.add("Cozinheiro");

        profissoes.stream()
                .filter(prof -> prof.startsWith("D"))
                .forEach(System.out::println);
    }

    public static void todosOsNomes(String... nomes){
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("\n\nStrem:");
        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void  imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for(int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Alana")){
                nomesParaImprimir += " " + nomes[i];
            }
        }

        System.out.println(nomesParaImprimir);

        String nomesParaImprimirStrem = Stream.of(nomes)
                .filter(nome -> nome.contains("a"))
                .collect(Collectors.joining(", ")); //Para um array e transforma em uma String

        System.out.println(nomesParaImprimirStrem);
    }

    public static void imprimirDobro(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }

        System.out.println("\n\nStream");
        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }
}
