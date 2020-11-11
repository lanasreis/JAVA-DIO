package Lambda;

public class Definicao {
    /*
        Os lambdas obedecem o conceito do paradigma funcional, como eles podemos facilitar legibilidade do nosso código, alem disso com a nova API Funcional do Java podemos ter uma alta produtividade para lidar com objetos. Primeiramente, devemos entender o que são interfaces funcionais

        *INTERFACES FUNCIONAIS
        - são interfaces que possuem apenas um método abstrato
        - geralmente as interfaces funcionais possuem uma anotação em nível de classe (@FunctionalInterface), para forçar o compilador a apontar um erro se a interface não estiver de acordo com as regras de uma interface funcional.
        Esta anatação não é obrigatória, pois o compilador consegue reconhecer uma interface em tempo de compilação

        Antes do Java8, se quiséssemos implementar um comportamento específico para uma única classe deveríamos utilizar uma classe anônima para implementar este comportamento

        Agora que sabemos como se define uma interface funcional  podemos, aprender como se define uma lambda
        Estrutura de uma lambda:
            InterfaceFuncional nomeVariavel = parametro -> logica

        BASTANTE ATENÇÃO
            -Quando uma lambda possui apenas uma instrução no corpo de sua lógica não é necessário o uso de chaves.
            Exemplo:
                InterfaceFuncional nomeVariavel = valor -> valor + "\n";

            -Se possui mais de um parametro:
                InterfaceFuncional nomeVariavel = valor ->{
                    String valorComprefixo = "Sr. " + valor;
                    String valorComPrefixoEPontoFinal = valorComPrefixo + ".";
                    return valorComPrefixoEPontoFinal;
                };


    */

}
