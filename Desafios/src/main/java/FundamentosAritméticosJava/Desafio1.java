package FundamentosAritméticosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Double> numeros = new ArrayList<>();

        numeros.add(Double.parseDouble(st.nextToken()));

        int aux = 1;
        while (aux < 6){
            st = new StringTokenizer(br.readLine());
            numeros.add(Double.parseDouble(st.nextToken()));
            aux++;
        }

        System.out.println(numeros.stream()
                .filter(element ->
                    element >= 0)
                .count() + " valores positivos");
        /*

        System.out.println();
        numeros.stream().forEach((elemnt) ->
                System.out.println(elemnt));

        int number1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number3 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number4 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number5 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int number6 = Integer.parseInt(st.nextToken());
    */
    }

}
