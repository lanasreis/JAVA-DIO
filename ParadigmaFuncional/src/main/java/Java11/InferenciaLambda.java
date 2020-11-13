package Java11;

import java.util.function.Function;

public class  InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divirPor2 = (var numero) -> numero/2.0;

        System.out.println(divirPor2.apply(9823));
        var nome = "Alana";
    }
}
