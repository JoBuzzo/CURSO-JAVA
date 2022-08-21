package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e Add: adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); //retorna falso
        fila.offer("Bia"); //lança uma exceção
        fila.add("Pedro");
        fila.offer("Carlos");
        fila.add("Bianca");
        fila.offer("Biatriz");
        fila.add("Daniel");

        //Peek e Element: vão obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.element()); //lança uma exceção

        /*
            fila.size()
            fila.clear()
            fila.isEmpty()
            fila.contains(...)
        */

        //Poll e Remove: vão obter o próximo elemento da fila e remove
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll()); //retorna null
        System.out.println(fila.remove()); //laça uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
