package Aula4;

import java.time.LocalDate;

public class LocalData {
    /*
        classe imutável para representar uma data
        Seu formato é yyyy-MM-dd
    */
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);


        System.out.println(ontem);
        System.out.println(hoje);

    }
}
