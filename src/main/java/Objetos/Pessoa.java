package Objetos;

public class Pessoa {
  private int idade;

  public Pessoa(int idade) {
    setIdade(idade);
  }

  // Getter
  public int getIdade() {
    return idade;
  }

  // Setter
  public void setIdade(int novaIdade) {
    novaIdade = Math.abs(novaIdade);

    if (novaIdade >= 0 && novaIdade <= 125) {
      this.idade = novaIdade;
    } else {

    }
  }
}
