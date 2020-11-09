package Exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse("16/09/2001");
        System.out.println(dataNascimento);

        System.out.println(dataNascimento.getTime());

        Date comparacao = sdf.parse("15/05/2010");
        System.out.println(dataNascimento.compareTo(comparacao));
    }
}
