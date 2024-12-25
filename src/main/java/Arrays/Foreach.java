package Arrays;

public class Foreach {
  public static void main(String[] args) {
    double[] notas = { 9.9, 8.7, 7.2, 9.4 };

    for (int x = 0; x < notas.length; x++) {
      System.out.println(notas[x]);
    }

    for (double nota: notas) {
      System.out.println(nota + " ");
    }
  }
}
