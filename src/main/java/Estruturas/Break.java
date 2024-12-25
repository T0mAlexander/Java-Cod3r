package Estruturas;

public class Break {
  public static void main(String[] args) {
    for (int x = 0; x < 10; x++) {
      if (x == 5) {
        break;
      }

      System.out.println(x);
    }
    System.out.println("Fim da contagem!");
  }
}
