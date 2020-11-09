package Aula1;

import java.util.Date;

public class LongDate {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
    }
    //pega a data com base no milissegundo apartir do epoch timestamp, padrão 1 de janeiro de 1970
}
