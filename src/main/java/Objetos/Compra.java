package Objetos;

import java.util.ArrayList;

public class Compra {
  String cliente;
  ArrayList<Item> itens = new ArrayList<Item>();

  void adicionarAoCarrinho(Item item) {
    itens.add(item);

    item.compra = this;
  }

  double precoTotal() {
    double total = 0;

    for (Item item: itens) {
      total += item.quantidade * item.preco;
    }

    return total;
  }
}
