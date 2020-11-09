package Exercicio3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Date agora = new Date();

        System.out.println(agora);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
