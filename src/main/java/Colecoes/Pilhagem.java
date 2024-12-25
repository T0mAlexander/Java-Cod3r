package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhagem {
  public static void main(String[] args) {
    Deque<String> livros = new ArrayDeque<String>();

    livros.add("American Prometheus");
    livros.push("The Physician");

    System.out.println(livros.peek());
    System.out.println(livros.element());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());

//    livros.size();
//    livros.clear();
//    livros.contains();
//    livros.isEmpty();
  }
}
