package ParadigmaFuncional;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ComposicoesdeFuncoes {
    public static void main(String[] args) {
    /*
        -Composições de funções: é criar uma nova função atraveś da composição de outras.
        Por exemplo, vamos criar uma função que vai filtrar um array, filtrando somente os números pares e multiplicando por dois
    */
        //FUNCIONAL
        int[] valores = {1,2,3,4};
        Arrays.stream(valores)
                .filter(numero -> numero%2 == 0)
                .map(numero -> numero*2)
                .forEach(valor -> System.out.println(valor));

        //IMPERATIVO
        for(int i=0; i< valores.length; i++){
            if (valores[i]%2 == 0){
                int valor = valores[i]*2;
                System.out.print(valor + "\n");
            }
        }
    }

}
