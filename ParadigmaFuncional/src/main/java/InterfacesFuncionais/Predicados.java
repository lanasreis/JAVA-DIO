package InterfacesFuncionais;

import java.util.function.Predicate;

public class Predicados {
    /*
        Os predicados recebem um parâmetro e retorna um boolean
    */
    public static void main(String[] args) {
        Predicate<String> estaVazio = String::isEmpty; //valor -> valor.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("alana"));
    }
}
