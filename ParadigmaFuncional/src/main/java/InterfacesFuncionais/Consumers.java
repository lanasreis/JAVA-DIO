package InterfacesFuncionais;

import java.util.function.Consumer;

public class Consumers {
    /*Metodo de referência
        -apenas utilizar o parametro da forma que ele foi recebido
    */
    public static void main(String[] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
//        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }

}
