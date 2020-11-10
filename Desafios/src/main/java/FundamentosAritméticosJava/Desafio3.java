package FundamentosAritméticosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(st.nextToken()));

        int aux = 1;
        while (aux < 5){
            st = new StringTokenizer(br.readLine());
            numeros.add(Integer.parseInt(st.nextToken()));
            aux++;
        }

        System.out.println(numeros.stream().filter(numero ->
                numero%2 == 0).count() + " valor(es) par(es)");

        System.out.println(numeros.stream().filter(numero ->
                numero%2 != 0).count() + " valor(es) impar(es)");

        System.out.println(numeros.stream().filter(numero ->
                numero > 0).count() + " valor(es) positivo(s)");

        System.out.println(numeros.stream().filter(numero ->
                numero < 0).count() + " valor(es) negativo(s)");

        /*
        numeros.stream().forEach(numero ->
                System.out.println(numero));
        */
    }

}
