package Fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class StringNumero {
  public static void main(String[] args) {
    String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
    String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

    double numero1 = Double.parseDouble(valor1);
    double numero2 = Double.parseDouble(valor2);

    double soma = numero1 + numero2;

    System.out.println("A soma é: " + soma);
    System.out.println("A média é: " + soma / 2);

//    BigDecimal fortuna = new BigDecimal(numero1);
  }
}
