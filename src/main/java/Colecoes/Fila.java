package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    Queue<String> fila = new LinkedList<String>();

    // Offer e Add -> adicionam elementos na fila
    fila.add("Tom");
    fila.offer("Rodrigo");
    fila.offer("Kaio");

    // Peek e Element -> obtêm o próximo elemento da fila sem o remover
    System.out.println(fila.peek());
    System.out.println(fila.element());

//    fila.size();
//    fila.clear();
//    fila.isEmpty();

    System.out.println(fila.poll());
    System.out.println(fila.remove());
    System.out.println(fila.poll());
    System.out.println(fila.remove());
  }
}
