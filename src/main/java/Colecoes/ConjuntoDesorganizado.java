package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDesorganizado {
  public static void main(String[] args) {
    HashSet conjunto = new HashSet();

    conjunto.add(1.2); // double -> Double
    conjunto.add(true); // boolean -> Boolean
    conjunto.add("Teste"); // String
    conjunto.add(1); // int -> Integer
    conjunto.add('x'); // char -> Character

    System.out.println("Tamanho é " + conjunto.size());

//    conjunto.add("teste"); // Acréscimo válido
    conjunto.add("Teste"); // Acréscimo inválido por ser repetido com o da linha 11

    System.out.println("Tamanho é " + conjunto.size());
    System.out.println(conjunto.remove("teste"));

    Set nums = new HashSet();
  }
}
