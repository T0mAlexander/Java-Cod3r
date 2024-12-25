package Fundamentos;

public class PrimitivoVsObjeto {
  public static void main(String[] args) {
    String algo = new String("texto");
    algo.toUpperCase();

    // Wrappers são a versão de objetos dos tipos primitivos
    int a = 123;
    System.out.println(a);
  }
}
