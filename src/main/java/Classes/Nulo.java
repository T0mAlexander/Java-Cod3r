package Classes;

public class Nulo {
  public static void main(String[] args) {
    String s1 = "";
    System.out.println(s1.concat("!!"));

    Data d1 = null;

    if (d1 != null) {
      d1.mes = 3;
      System.out.println(d1.obterDataFormatada());
    }

    String s2 = null;
    System.out.println(s2.concat("!! "));
  }
}
