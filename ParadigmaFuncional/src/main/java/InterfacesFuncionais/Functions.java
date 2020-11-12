package InterfacesFuncionais;

import java.util.function.Function;

public class Functions {
    /*
        As functions recebem um parâmetro e respondem um parâmetro
    */
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiro = texto -> Integer.valueOf(texto) * 3;
        System.out.println(retornaNomeAoContrario.apply("Alana"));
        System.out.println(converterStringParaInteiro.apply("30"));
    }
}
