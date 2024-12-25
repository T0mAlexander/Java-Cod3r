package Objetos;

public class CarroTeste {
  public static void main(String[] args) {

    Carro mercedes = new Carro();
    System.out.println(mercedes.estaLigado());

    mercedes.ligar();
    System.out.println(mercedes.estaLigado());
    System.out.println(mercedes.motor.rotacoes());

    mercedes.acelerar();
    mercedes.acelerar();

    System.out.println(mercedes.motor.rotacoes());

    mercedes.frear();
    mercedes.frear();
    mercedes.frear();

    System.out.println(mercedes.motor.rotacoes());
  }
}
