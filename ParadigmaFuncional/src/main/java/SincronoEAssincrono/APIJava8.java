package SincronoEAssincrono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class APIJava8 {
    private static final ExecutorService pessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());

        casa.obterAfazeresDaCasa().forEach(atividade -> pessoasParaExecutarAtividades.execute(() -> {
            try {
                atividade.realizar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        pessoasParaExecutarAtividades.shutdown();
        //Não executa sempre na mesma ordem, são 3 threds sendo realizadas ao mesmo tempo

    }

}

interface Atividade {
    void realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa() {
        return this.comodos.stream()
                .map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

class Quarto extends Comodo {

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private void arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Arrumar o guarda roupa");
    }

    private void varrerQuarto() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Varrer o quarto");
    }

    private void arrumarCama() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Arrumar a cama");
    }
}