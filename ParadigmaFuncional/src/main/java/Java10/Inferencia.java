package Java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Inferencia {
    public static void main(String[] args) throws IOException {
//        connectAndPrintSemInferencia();
//        BufferedReader bufferedReader = connectAndPrintVar();

//        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

        printarNomeCompleto("Alana", "Soares");
        printaSoma(23);
    }

    public static void printarNomeCompleto(String nome, String sobrenome){//var não pode ser usado como parâmetro. Ex:  testar(var nome);
        var nomeCompleto = nome+ " " + sobrenome;
        System.out.println(nomeCompleto);
    }

    public static void printaSoma(int... numeros){
        //var soma; //Nao pode ser usada em variaveis locais não inicializadas
        //soma = 0;
        var soma = 0;
        for (var numero : numeros){
            soma+=numero;
        }

        System.out.println("A soma eh: " + soma);
    }


//    SEM INFERENCIA
    private static BufferedReader connectAndPrintVar() throws IOException {
        var url= new URL("https://docs.oracle.com/javase/10/language");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        return bufferedReader;
    }


//    O var pode ser utilizado para variaveis locais
    private static void connectAndPrintSemInferencia() throws IOException {
        URL url= new URL("https://docs.oracle.com/javase/10/language");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
    }
    /*
    var não pode ser usado a nivel de classe
    */
}
