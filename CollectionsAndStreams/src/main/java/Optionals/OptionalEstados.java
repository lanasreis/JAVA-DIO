package Optionals;

import java.util.Optional;

public class OptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor opcional esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não esta presente"));

        Optional<String> optionalNULL = Optional.ofNullable(null);
        System.out.println("Valor opcional não esta presente");
        optionalNULL.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional não esta presente");
        optionalNULL.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional não esta presente");
        optionalNULL.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));

    }
}
