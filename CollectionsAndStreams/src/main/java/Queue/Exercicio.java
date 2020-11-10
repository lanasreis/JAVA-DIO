package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        Queue<String> filaPessoas = new LinkedList<>();

        filaPessoas.add("Juliana");
        filaPessoas.add("Pedro");
        filaPessoas.add("Carlos");
        filaPessoas.add("Larissa");
        filaPessoas.add("Joao");

        for (String nome : filaPessoas){
            System.out.println("---->" + nome);
        }

        System.out.println("1 elemento da fiila: " + filaPessoas.peek());
        System.out.println("Fila: " + filaPessoas);

        System.out.println("Retirei 1 elemento da fiila: " + filaPessoas.poll());
        System.out.println("Fila: " + filaPessoas);

        filaPessoas.add("Daniel");
        System.out.println("Fila: " + filaPessoas);
        int index = 0;
        for(String pessoa : filaPessoas){
            if(pessoa == "Daniel"){
                break;
            }
            index++;
        }
        if(index == filaPessoas.size()){
            System.out.println("O nome não está contido na fila");
        }
        else{
            System.out.println("O nome esta na posicao "+ index);
        }

        System.out.println("Fila vazia? " + filaPessoas.isEmpty());

        System.out.println("Fila: " + filaPessoas);

        index = 0;
        for(String pessoa : filaPessoas){
            if(pessoa == "Carlos"){
                break;
            }
            index++;
        }
        if(index == filaPessoas.size()){
            System.out.println("O nome não está contido na fila");
        }
        else{
            System.out.println("O nome esta na posicao "+ index);
        }

        filaPessoas.clear();
        System.out.println(filaPessoas.poll());
    }
}
