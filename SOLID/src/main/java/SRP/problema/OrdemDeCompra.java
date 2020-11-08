package SRP.problema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionaProdutos(Produto produto){
        produtos.add(produto);
    }

    public void removeProdutos(Produto produto){
        produtos.remove(produto);
    }
/*
    public BigDecimal calcularTotal(){
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
*/
    public List<OrdemDeCompra> buscarOrdensDeCompra(){
        //retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void alterarOrdemDeCompar(){
        //alterar base de dados
    }

    public void salvarOrdemCompra(){
        //salva lista de produtos na base de dados
    }

    public void enviarEmail(){
        //envia email de ordens de compra
    }

    public void imprimirOrdemDeCompra(){
        //imprime a ordem de compra
    }
}
