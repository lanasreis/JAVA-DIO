package FundamentosAritméticosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        List<Integer> celulas = new ArrayList<>();

        celulas.add(100);
        celulas.add(50);
        celulas.add(20);
        celulas.add(10);
        celulas.add(5);
        celulas.add(2);
        celulas.add(1);

        Integer valor = Integer.parseInt(st.nextToken());
        Integer auxValor = valor;
        System.out.println(valor);

        Iterator<Integer> celula = celulas.iterator();
        while (celula.hasNext()){
            Integer num = celula.next();
            System.out.println(((auxValor - (auxValor%num))/num) + " nota(s) de R$ " + num + ",00");
            auxValor = auxValor%num;
        }
    }
}
