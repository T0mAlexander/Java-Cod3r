package Colecoes;

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {
    ArrayList<Usuario> lista = new ArrayList<>();

    Usuario u1 = new Usuario("Tom");

    lista.add(u1);
    lista.add(new Usuario("Rodrigo"));
    lista.add(new Usuario("Kaio"));

    System.out.println(lista.get(2).nome);

    for (Usuario usuario: lista) {
      System.out.println(usuario.nome);
    }
  }
}
