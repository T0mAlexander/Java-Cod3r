package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoOrganizado {
  public static void main(String[] args) {
    Set<String> artistas = new HashSet<String>();
    artistas.add("Flo Rida");
    artistas.add("Macklemore");
    artistas.add("Drake");

    for (String cantor: artistas) {
      System.out.println(cantor);
    }
  }
}
