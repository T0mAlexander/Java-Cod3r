package Fundamentos.Controle;

import javax.swing.*;

public class IfElse {
  public static void main(String[] args) {
    String valor = JOptionPane.showInputDialog("Informe o número: ");
    int numero = Integer.parseInt(valor);

    if (numero % 2 == 1) {
      System.out.println("Número ímpar");
    } else {
      System.out.println("Número par");
    }
  }
}