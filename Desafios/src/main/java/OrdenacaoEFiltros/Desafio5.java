package OrdenacaoEFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true){
            int n = Integer.parseInt(st.nextToken());
            if(n == 0)
                break;

            List<Aluno> alunos = new ArrayList<>();

            while (n > 0){
                st = new StringTokenizer(br.readLine());
                String nome = st.nextToken();
                int numero = Integer.parseInt(st.nextToken());

                Aluno aluno = new Aluno(nome, numero);
                alunos.add(aluno);
                n--;
            }

            int posAtual = 0;
            int numSoma = alunos.get(0).getNumero();
            while (true){
                if (alunos.size() == 1){
                    break;
                }
                int posRemove = 0;
                int tamanho = alunos.size();

                if(numSoma%2 == 0){
                    //é par
                    posRemove = (posAtual - (numSoma%tamanho) + tamanho)%tamanho;
                }
                else{
                    //é impar
                    posRemove = (posAtual + numSoma)%tamanho;
                }

                numSoma = alunos.get(posRemove).getNumero();

                if(numSoma%2 == 0){
                    posAtual = (posRemove)%(tamanho-1);
                }
                else{
                    posAtual = (posRemove - 1 + tamanho - 1)%(tamanho-1);
                }
                alunos.remove(posRemove);

            }
            System.out.println("Vencedor(a): " + alunos.get(0).getNome());


            st = new StringTokenizer(br.readLine());
        }
    }
}

class Aluno{
    private String nome;
    private int numero;

    Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    String getNome(){
        return nome;
    }

    int getNumero(){
        return numero;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.numero;
    }
}