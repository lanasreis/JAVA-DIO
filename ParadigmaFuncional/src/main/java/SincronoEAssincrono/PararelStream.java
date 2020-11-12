package SincronoEAssincrono;

import java.util.stream.IntStream;

public class PararelStream {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatoril(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Serial: " + (fim-inicio));


        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatoril(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Parallel: " + (fim-inicio));
    }

    public static long fatoril(int num){
        int fat = 1;
        for (int i=2; i<=num; i++){
            fat*=i;
        }
        return fat;
    }
}
