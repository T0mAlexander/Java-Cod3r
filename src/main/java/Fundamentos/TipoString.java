package Fundamentos;

public class TipoString {
  public static void main(String[] args) {
    System.out.println("Java".charAt(2));

    String saudacao = "Boa noite";
    System.out.println((saudacao.concat("!!!")));
    System.out.println(saudacao + "!!!");
    System.out.println(saudacao.startsWith("Boa"));
    System.out.println(saudacao.toLowerCase().startsWith("boa"));
    System.out.println(saudacao.toUpperCase().startsWith("BOA"));
    System.out.println(saudacao.length());
    System.out.println(saudacao.endsWith("noite"));

    var nome = "Pedro";
    var sobrenome = "Santos";
    var idade = 24;
    var salario = 123.45;

    String descricao = "Nome: "  + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
    System.out.println(descricao);

    System.out.printf("O senhor %s %s tem %d anos e ganha R$%2.f.", nome, sobrenome, idade, salario);


  }
}
