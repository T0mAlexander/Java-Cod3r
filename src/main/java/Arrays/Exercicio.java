package Arrays;

import java.util.Arrays;

public class Exercicio {
  public static void main(String[] args) {
    double[] notasAlunoA = new double[3];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;

    System.out.println(Arrays.toString(notasAlunoA));

    double total = 0;
    for (int x = 0; x < 3; x++) {
      total += notasAlunoA[x];
    }

    System.out.println(total / 3);
    double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

    for (int x = 0; x < notasAlunoB.length; x++) {
      
    }
  }
}
