package Estruturas;

public class Continue {
  public static void main(String[] args) {
    for (int x = 0; x < 10; x++) {
      if (x % 2 == 1) continue;
      System.out.println(x);
    }
    System.out.println("Fim");
  }
}
