package Fundamentos.Controle;

public class For1 {
  public static void main(String[] args) {
    for(int contador = 1; contador <= 10; contador++) {
      System.out.printf("x = %d\n", contador);
    }

    int x = 2;
    for (;x < 10;) {
      System.out.println("x = " + x);
    }
  }
}
