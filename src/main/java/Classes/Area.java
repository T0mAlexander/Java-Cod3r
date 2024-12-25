package Classes;

public class Area {
  double raio;
  static final double PI = 3.1415;

  Area(double raioInicial) {
    raio = raioInicial;
  }

  double area () {
    return PI * Math.pow(raio, 2);
  }
}
