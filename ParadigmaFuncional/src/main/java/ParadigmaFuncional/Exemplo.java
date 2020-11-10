package ParadigmaFuncional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Exemplo {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculaValorVezes3 = valor -> valor*3;//declara o comportamento antes de precisar usá-lo
        int valor = 10;
        System.out.printf("O resultado eh: " + calculaValorVezes3.apply(valor));

        /*
            É comum aprender a programar de forma imperativa, onde mandamos alguém fazer algo. Busque o usuário 15 no bd. Valide essas informações do usuário

            Na programação funcional tentamos programar de forma declaraativa, onde declaramos o que desejamos, sem explicitar como será feito. Qual o usuário 15? Quais os erros dessas informações
        */

        Function<Integer, Object> buscarUsuario = idUsuario ->
                //buscaUsuario
                new Object();
        System.out.println(buscarUsuario);
    }
}
