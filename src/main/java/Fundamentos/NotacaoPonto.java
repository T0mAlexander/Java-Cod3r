package Fundamentos;

public class NotacaoPonto {
  public static void main(String[] args) {
    double a = 2.3;
    String saudacao = "Bom dia Java";
    saudacao = saudacao.replace("Java", "Tom");
    saudacao = saudacao.toUpperCase();
    saudacao = saudacao.concat("!!!");

    System.out.println(saudacao);
    String framework = "Quarkus".toUpperCase();
  }
}