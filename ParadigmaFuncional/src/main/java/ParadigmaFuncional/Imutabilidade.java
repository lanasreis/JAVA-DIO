package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    /*
        Significa que uma vez que uma variável que recebeu um valor, vai possuir esse valor sempre, ou quando criamos um objeto ele não pode ser modificado
    */
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornaDobro = v -> v*2;
        System.out.println(retornaDobro.apply(valor)); //retorna o dobre do valor
        System.out.println(valor); //NÂO será Alterado
    }
}
