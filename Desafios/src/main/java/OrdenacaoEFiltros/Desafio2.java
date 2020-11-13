package OrdenacaoEFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        while (n>0){
            TreeSet<String> compras = new TreeSet<>();
            st = new StringTokenizer(br.readLine());
            while (true){
                compras.add(st.nextToken());
                if (!st.hasMoreTokens()){
                    break;
                }
            }
            System.out.println(compras.stream().collect(Collectors.joining(" ")));
            n--;
        }

    }
}
