package SRP.solucao;

import SRP.problema.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
    private List<SRP.problema.Produto> produtos = new ArrayList<>();

    public void adicionaProdutos(SRP.problema.Produto produto) {
        produtos.add(produto);
    }

    public void removeProdutos(SRP.problema.Produto produto) {
        produtos.remove(produto);
    }

    /*
    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    */
}