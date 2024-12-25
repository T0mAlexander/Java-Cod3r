package Estruturas;

public class SwitchCase {
  public static void main(String[] args) {
    int dia = 1;

    switch (dia) {
      case 1:
        System.out.println("Domingo");
      case 2:
        System.out.println("Segunda-feira");
      case 3:
        System.out.println("Terça-feira");
      default:
        System.out.println("Dia inválido!");
    }
  }
}
