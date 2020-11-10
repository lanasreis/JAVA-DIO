package FundamentosAritméticosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double y = Double.parseDouble(st.nextToken());

        System.out.printf("%.3f km/l%n", x/y);
//        System.out.printf("%.3f km/l" + x*y);
    }
}
