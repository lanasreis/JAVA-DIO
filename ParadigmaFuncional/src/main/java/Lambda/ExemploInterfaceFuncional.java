package Lambda;

public class ExemploInterfaceFuncional {
    public static void main(String[] args) {
        //Antes da versão 8
        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("Alisson"));

        //Com a LAMBDA
        Funcao colocarPrefixoSenhoritaNaString = valor -> "Srta. " + valor;
        System.out.println(colocarPrefixoSenhoritaNaString.gerar("Alana"));

        Funcao colocarPrefixoSenhoritaNaStringEPonto = valor ->{
            String a = "Srta. " + valor;
            String b = a + ".";
            return b;
        };
        System.out.println(colocarPrefixoSenhoritaNaStringEPonto.gerar("Alana"));


    }
}


@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}