package Excessoes;

public class Basico {
  public static void main(String[] args) {
    try {
      System.out.println(7 / 0);
    } catch (ArithmeticException erro) {
      System.out.println("Erro no cálculo: " + erro.getMessage());
    }
  }
}
