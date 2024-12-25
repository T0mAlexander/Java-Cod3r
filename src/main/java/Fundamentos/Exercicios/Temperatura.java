package Fundamentos.Exercicios;

public class Temperatura {
  public static void main(String[] args) {
    double farenheit = 82.9;

    final double celsius = ((farenheit - 32) * 5) / 9;
    System.out.println("Temperatura: " + celsius + " °C");
  }

}
