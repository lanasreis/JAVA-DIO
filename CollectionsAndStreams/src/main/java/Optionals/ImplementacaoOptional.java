package Optionals;

import java.util.Optional;

public class ImplementacaoOptional {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("valor ]opcional");

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());


        stringOptional.ifPresent(System.out::println);


        stringOptional = Optional.ofNullable(null);

        stringOptional.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não esta presente"));

        if (stringOptional.isPresent()){
            String valor = stringOptional.get();
            System.out.println(valor);
        }

        stringOptional.map((valor) -> valor.concat("****")).ifPresent(System.out::println);
        stringOptional.orElseThrow(IllegalStateException::new);
    }
}
