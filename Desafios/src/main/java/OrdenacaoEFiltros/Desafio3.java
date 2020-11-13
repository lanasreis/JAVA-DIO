package OrdenacaoEFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){

            int n = Integer.parseInt(st.nextToken());
            if (n == 0){
                break;
            }

            List<Pedidos> pedidos = new ArrayList<>();

            while ( n > 0 ){
                st = new StringTokenizer(br.readLine());
                List<String> nome = new ArrayList<>();
                String nomeStr;
                String cor;
                String tamanho;

                while (true){
                    nome.add(st.nextToken());
                    if (!st.hasMoreTokens()){
                        break;
                    }
                }
                nomeStr = nome.stream().collect(Collectors.joining(" "));

                st = new StringTokenizer(br.readLine());
                cor = st.nextToken();
                tamanho = st.nextToken();

                Pedidos pedido = new Pedidos(nomeStr, tamanho, cor);
                pedidos.add(pedido);

                n--;
            }

            Collections.sort(pedidos);
            pedidos.stream().forEach(pedido -> System.out.println(pedido.toString()));


            st = new StringTokenizer(br.readLine());
        }
}
}

class Pedidos implements Comparable<Pedidos>{
    public String nome;
    public String tamanho;
    public String cor;

    public Pedidos(String nome, String tamanho, String cor){
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTamanho(){
        return this.tamanho;
    }


    public String getCor(){
        return this.cor;
    }

    @Override
    public String toString(){
        return this.cor + " " + this.tamanho + " " + this.nome;
    }


    @Override
    public int compareTo(Pedidos proximoPedido) {

        if (this.getCor().length() < proximoPedido.getCor().length()){
            return -1;
        }
        if (this.getCor().length() > proximoPedido.getCor().length()){
            return 1;
        }


        if(this.getTamanho().contains("P") && (proximoPedido.getTamanho().contains("M") || proximoPedido.getTamanho().contains("G"))) {
            return -1;
        }
        if(this.getTamanho().contains("M") && proximoPedido.getTamanho().contains("G")) {
            return -1;
        }
        if(this.getTamanho().contains("M") && proximoPedido.getTamanho().contains("P")) {
            return 1;
        }
        if(this.getTamanho().contains("G") && (proximoPedido.getTamanho().contains("P") || proximoPedido.getTamanho().contains("M"))) {
            return 1;
        }

        return this.getNome().compareTo(proximoPedido.getNome());
    }

}