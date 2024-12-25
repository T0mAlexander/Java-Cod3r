package Classes;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.ano = 2024;
    var d2 = new Data(31, 12, 2023);

    String dataFormatada1 = d1.obterDataFormatada();

    System.out.println(dataFormatada1);
    System.out.println(d2.obterDataFormatada());

    d1.mostrarDataFormatada();
    d2.mostrarDataFormatada();
  }
}
