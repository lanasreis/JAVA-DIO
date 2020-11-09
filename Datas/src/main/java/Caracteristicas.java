import java.util.Date;

public class Caracteristicas {

    /*
        JAVA.UTIL.DATE
    - Implementado desde o JDK 1.0, algumas coisas não são interessantes nos dias atuais devia a idade

    */
    /* CONSTRUTORES */
    //Aloca um objeto da classe Date, vai ser inicializado com o milissegundo mais próximo da execução*/
    //Date();
    //Date(long date);


    /*Marcados com @Deprecated desde a versão 1.1*/
    //Date(int year, int month, int date);
    //Date(int year, int month, int date, int hrs, int min);
    //Date(int year, int month, int date, int hrs, int min, int sec);
    //Date(String s);

    /*Métodos úteis*/
    //after(Date) - (boolean) checa se o objeto Data de referência é posterior ao comparado
    //before(Date) - (boolean) checa se o objeto Data de referência é anterior ao comparado
    //compareTo(Date) - (int) compara dois objetos Data
    //equals(Date) - (boolean) checa se os objetos são iguais
    //getTime() - (long) retorna a datem milissegundos
    //setTime(Long) - (void) define uma data com base em milissegundos
    //from(Instante) - (static Date) define uma data com base em um Instant
    //tolInstant() - (Instant) retorna um Instant com base em um Date
}
