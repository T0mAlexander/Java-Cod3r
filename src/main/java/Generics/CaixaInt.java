package Generics;

public class CaixaInt<Integer> extends Caixa {
  private java.lang.Integer coisa;

  public void guardar(java.lang.Integer coisa) {
    this.coisa = coisa;
  }

  public java.lang.Integer abrir() {
    return coisa;
  }
}
