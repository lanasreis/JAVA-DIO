package Aula1;

import java.util.Date;

public class AfterAndBefore {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(151312485923812L);
        Date dataNoFuturo = new Date(1812131415161631L);

        /* Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);

        /* Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);

    }
}
