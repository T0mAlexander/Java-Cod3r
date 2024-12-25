package Fundamentos;

public class VarsConsts {
  public static void main(String[] args) {
    int raio = 3;

    // Nome de constantes devem ser maiúsculo
    final double PI = 3.14159;
    double area = PI * raio * raio;

    System.out.println(area);

    raio = 10;
    area = PI * raio * raio;
    System.out.println("Área: " + area + " m²");
  }
}
