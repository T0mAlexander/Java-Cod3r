package Fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {
  public static void main(String[] args) {
    System.out.print("Bom");
    System.out.print(" dia!\n");

    System.out.println("Bom");
    System.out.println(" dia!");

    System.out.printf("Números da megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
    System.out.printf("Números da megasena: %.1f", 2513.453);

    Scanner entrada = new Scanner(System.in);
    
    entrada.nextLine();
  }
}
