package Classes;

public class ProdutosTeste {
  public static void main(String[] args) {
    Produto p1 = new Produto(
      "Laptop",
      4350,
      0.15);

    p1.nome = "Laptop";
    p1.preco = 4350;
    p1.desconto = 0.15;

    var p2 = new Produto(
      "Mochila",
      25.99,
      0.1);

    p2.nome = "Mochila";
    p2.preco = 25.99;
    p2.desconto = 0.1;

    System.out.println(p1.nome);
    System.out.println(p2.nome);

    double precoFinal1 = p1.preco * (1 - p1.desconto);
    double precoFinal2 = p2.preco * (1 - p2.desconto);

    double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

    System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
  }
}
