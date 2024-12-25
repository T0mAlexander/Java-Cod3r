package Classes;

public class Data {
  int dia;
  int mes;
  int ano;

  Data() {
//    dia = 1;
//    mes = 1;
//    ano = 1970;
    this(1, 1, 1970);
  }

  Data(int dia, int mesInicial, int anoInicial) {
    this.dia = dia;
    this.mes = mesInicial;
    this.ano = anoInicial;
  }

  String obterDataFormatada() {
    final String formato = "%d/%d/%d";
    return String.format(formato, dia, mes, ano);
  }

  void mostrarDataFormatada() {
    System.out.println(obterDataFormatada());
  }
}
