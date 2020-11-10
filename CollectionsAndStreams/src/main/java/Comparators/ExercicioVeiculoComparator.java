package Comparators;

import java.util.Comparator;

public class ExercicioVeiculoComparator implements Comparator<ExercicioVeiculo> {

    @Override
    public int compare(ExercicioVeiculo atual, ExercicioVeiculo proximo) {
        if(atual.getValorTabelaFipe() > proximo.getValorTabelaFipe())
            return 1;
        if(atual.getValorTabelaFipe() < proximo.getValorTabelaFipe())
            return -1;
        return 0;
    }
}
