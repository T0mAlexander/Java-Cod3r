package Objetos;

public class CompraTeste {
  public static void main(String[] args) {
    Compra c1 = new Compra();
    c1.cliente = "Tom";
    c1.adicionarAoCarrinho(new Item("Lápis", 3, 3.65));
    c1.adicionarAoCarrinho(new Item("Caderno", 1, 14.75));

    System.out.println(c1.itens.size());
    System.out.println("R$" + c1.precoTotal());
  }
}
