package Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Fabio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");
        System.out.println(filaDeBanco);

        System.out.println("Primero a ser atendido (remove): " + filaDeBanco.remove());
        System.out.println("fila após atendimento: " + filaDeBanco);
        System.out.println("Segundo a ser atendido (poll): " + filaDeBanco.poll());
        System.out.println("fila após atendimento: " + filaDeBanco);
        System.out.println("Terceiro que deverá ser atendido (peek): " + filaDeBanco.peek());
        System.out.println("fila após atendimento: " + filaDeBanco);
        System.out.println("Proximo a ser atendido(element): " + filaDeBanco.element());
        System.out.println("fila atual: " + filaDeBanco);

        int index = 0;
        for (String cliente : filaDeBanco){
            System.out.println("Cliente " + index++ + " eh: " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("----->" + iteratorFilaBanco.next());
        }

        System.out.println("Qtd de elemntos? " + filaDeBanco.size());
        System.out.println("Lista vazia? " + filaDeBanco.isEmpty());

        filaDeBanco.clear();
        System.out.println("Fila vazia: " + filaDeBanco.peek());
        System.out.println("Fila vazia: " + filaDeBanco.element());

    }
}
