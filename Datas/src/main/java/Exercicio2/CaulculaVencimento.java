package Exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CaulculaVencimento {
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        String data;
        data = ler.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Calendar dataNascimento = (sdf.getCalendar());
        System.out.println(dataNascimento);
    }
}
