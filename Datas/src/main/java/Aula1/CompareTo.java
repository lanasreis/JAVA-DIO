package Aula1;

import java.util.Date;

public class CompareTo {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(111213141516171819L);
        Date dataNoFuturo = new Date(211213141516171819L);
        Date mesmaDataNoFuturo = new Date(211213141516171819L);

        /*Comparande se as datas são iguais*/
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals);

        /* Comparando uma data com a outra */
        int compareCaso1 = dataNoPassado.compareTo(dataNoFuturo); //-1 anterior a data comparada
        int compareCaso2 = dataNoFuturo.compareTo(dataNoPassado);// 1 postarior a data comparada
        int compareCaso3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); // 0 mesma data comparada

        System.out.println(compareCaso1);
        System.out.println(compareCaso2);
        System.out.println(compareCaso3);
    }
}
