package Aula4;

import java.time.LocalDateTime;

public class LocaldateTempo {
    /*
        Espécie de jução entre o LocalTime e o LocalDate
        Classe imutável e consegue trabalhar com dia e hora de uma só vez
    */

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(3).plusHours(21).plusYears(5);

        System.out.println(agora);
        System.out.println(futuro);
    }
}
