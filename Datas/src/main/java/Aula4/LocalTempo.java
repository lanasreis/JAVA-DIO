package Aula4;

import java.time.LocalTime;

public class LocalTempo {
    /*
        Classe imutável que representa um padrão de hora-minuto-segundo
        Pode ser representado até nanosegundos
    */
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime mainUmHora = agora.plusHours(1);
        System.out.println(mainUmHora);
    }
}
