package Aula2;

import java.util.Calendar;

public class UsoCalendar {
    /*
        Classe abstrata que provê métodos para converter data entre um instante específico
        Possui alguns campos específicos para manioulação como  month, year, hour

    */

    public static void main(String[] args) {
        Calendar agora  = Calendar.getInstance();
        System.out.println("A data corrente eh: " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, +4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());

        System.out.printf("%tc\n", agora);
        //sab fev 25 13:46:29 BRT 2023

        System.out.printf("%tF\n", agora);
        //2023-02-25

        System.out.printf("%tD\n", agora);
        //02/25/23

        System.out.printf("%tr\n", agora);
        //01:48:07 PM

        System.out.printf("%tT\n", agora);
        //13:48:32


    }
}
