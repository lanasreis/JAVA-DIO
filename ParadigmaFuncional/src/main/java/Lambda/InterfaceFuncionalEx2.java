package Lambda;

@FunctionalInterface
public interface InterfaceFuncionalEx2 {
    String gerar(String valor);
    default Integer gerarNumero(Integer valor){
        return valor;
    }
}
