package Aula3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormato {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFromatada = formatter.format(agora);

        System.out.println(dataFromatada);
    }
}
