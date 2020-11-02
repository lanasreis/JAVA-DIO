package interfaces;

public interface Carro {
    String marca();

    Double valor();

    default void ligar() {

        System.out.println("Ligando o carro!");
    }

    default String codigoRenavan() {
        return "6533jijiio";
    }

}
