/*
package SincronoEAssincrono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class APIJava8Call {
        */
/*Toda vez que tiver que utilizar uma concorrencia é indicado utilizar o método submit*//*


    private static final ExecutorService pessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        CasaCall casaCall = new CasaCall(new QuartoCall());

        List<? extends Future<String>> futuros =
            new CopyOnWriteArrayList<Future<String>>(casaCall.obterAfazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividades.submit(() -> {
                    try {
                        return atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                )
                .collect(Collectors.toList()));


        while (futuros.stream().allMatch(Future::isDone)){
            int numeroAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro : futuros) {
                if(futuro.isDone()){
                    try {
                        System.out.println("Parabens voce terminou de " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroAtividadesNaoFinalizadas++;
                }
            }
            System.out.println("Numero de atividade nao finalizadas: " + numeroAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }

        pessoasParaExecutarAtividades.shutdown();
        //Não executa sempre na mesma ordem, são 3 threds sendo realizadas ao mesmo tempo

    }

}

interface AtividadeCall {
    void realizar() throws InterruptedException;
}

abstract class ComodoCall {
    abstract List<AtividadeCall> obterAfazeresDoComodo();
}

class CasaCall {
    private List<ComodoCall> comodos;

    CasaCall(ComodoCall... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<AtividadeCall> obterAfazeresDaCasa() {
        return this.comodos.stream()
                .map(ComodoCall::obterAfazeresDoComodo)
                .reduce(new ArrayList<AtividadeCall>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

class QuartoCall extends ComodoCall {

    @Override
    List<AtividadeCall> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Arrumar o guarda roupa");
        return "Arrumar o guarda roupa";
    }

    private String varrerQuarto() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Varrer o quarto");
        return "Varrer o quarto";
    }

    private String arrumarCama() throws InterruptedException {
        Thread.sleep(8000);
        System.out.println("Arrumar a cama");
        return "Arrumar a cama";
    }
}*/
