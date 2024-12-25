package Objetos;

public class Carro {
  final Motor motor;

  Carro() {
    this.motor = new Motor(this);
  }

  void acelerar() {
    if (motor.fatorInjecao < 2.0) {
      motor.fatorInjecao += 0.4;
    }
  }

  void frear() {
    if (motor.fatorInjecao > 0.5) {
      motor.fatorInjecao -= 0.4;
    }
  }

  void ligar() {
    motor.ligado = true;
  }

  boolean estaLigado() {
    return motor.ligado;
  }
}
