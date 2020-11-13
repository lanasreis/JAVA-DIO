package OrdenacaoEFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();


        int n = Integer.parseInt(st.nextToken());

        while (n > 0){
            st =  new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num%2 == 0){
                pares.add(num);
            }
            else{
                impares.add(num);
            }
            n--;
        }

        pares.stream().sorted().forEach(System.out::println);
        impares.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
