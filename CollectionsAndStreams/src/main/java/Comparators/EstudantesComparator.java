package Comparators;

import java.util.Comparator;

public class EstudantesComparator implements Comparator<Estudantes> {
    @Override
    public int compare(Estudantes atual, Estudantes proximo){
        return proximo.getIdade() - atual.getIdade();
    }
}
