package InterfacesFuncionais;

public class FuncoesDeAltaOrdem {
    /*
         São funções que recebem uma função por parâmetro,
          ou retornam uma função por parâmetro
    */
    public static void main(String[] args) {
        Calcular soma = (a, b) -> a + b;
        Calcular subtracao = (a, b) -> a - b;
        Calcular multiplicacao = (a, b) -> a * b;
        Calcular divisao = (a, b) -> a / b;

        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 1, 3));
        System.out.println(executarOperacao(divisao, 1, 3));
        System.out.println(executarOperacao(multiplicacao, 1, 3));
    }

    public static int executarOperacao(Calcular calculo, int a, int b){
        return calculo.calculo(a, b);
    }
}

@FunctionalInterface
interface Calcular{
    public int calculo(int a, int b);
}