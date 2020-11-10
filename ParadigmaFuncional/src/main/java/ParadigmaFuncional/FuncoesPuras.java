package ParadigmaFuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        /*
            É chamada de pura quando invocada mais de uma vez produz exatamente o mesmo resultado
        */

        BiPredicate<Integer, Integer> verificaSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(verificaSeEMaior.test(13,12));
        System.out.println(verificaSeEMaior.test(13,12));
    }
}
