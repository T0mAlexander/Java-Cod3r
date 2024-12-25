package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {
    Map<Integer, String> usuarios = new HashMap<Integer, String>();
    usuarios.put(1, "Tom");
    usuarios.put(1, "Rodrigo");

    System.out.println(usuarios.size());

    System.out.println(usuarios.keySet());
    System.out.println(usuarios.values());
    System.out.println(usuarios.entrySet());
    System.out.println(usuarios.containsKey(1));
    System.out.println(usuarios.containsValue("Tom"));
    System.out.println(usuarios.get(1));

    for (int chave: usuarios.keySet()) {
      System.out.println(chave);
    }

    for (String valor: usuarios.values()) {
      System.out.println(valor);
    }

    for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
      System.out.println(registro.getKey());
      System.out.println(registro.getValue());
    }
  }
}
