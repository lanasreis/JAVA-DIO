package Aula1;

import java.time.Instant;
import java.util.Date;

public class FromAndToInstant {
    /*Instant surgiu na JDK 1.8
        Imutável e Thread safe
        Modela um ponto instantâneo da uma linha do tempo
        Indicado para gravar marcações temporais em eventos da sua aplicação
    */

    public static void main(String[] args) {

        Date dataInicio = new Date(13141516171819L);
        System.out.println(dataInicio);
        //Mon Jun 09 18:09:31 BRT 2386

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        //2386-06-09T21:09:31.819Z
    }
}
