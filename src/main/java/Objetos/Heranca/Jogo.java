package Objetos.Heranca;

public class Jogo {
  public static void main(String[] args) {
    Jogador j1 = new Jogador();
    j1.andar(Direcao.NORTE);

    Heroi j2 = new Heroi();
    j1.andar(Direcao.LESTE);

    System.out.println(j1);
    System.out.println(j2);
  }
}
