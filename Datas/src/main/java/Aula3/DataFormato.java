package Aula3;

import java.text.DateFormat;
import java.util.Date;

public class DataFormato {
    /*
        Existem duas classes para formatação de datas, DataFormat e SimpleDateFormat
    */
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
    }
}
