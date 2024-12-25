package Classes;

public class Produto {
  String nome;
  double preco;
  double desconto;

  Produto(String nomeInicial, double precoInicial, double descontoInicial) {
    nome = nomeInicial;
    preco = precoInicial;
    desconto = descontoInicial;
  }

  double descontoNatal(double descontoDeNatal) {
    return preco * (1 - desconto + descontoDeNatal);
  }
}
