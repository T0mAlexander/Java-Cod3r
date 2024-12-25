package Colecoes;

public class Usuario {
  String nome;

  Usuario(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "O nome é" + this.nome + ".";
  }

  @Override
  public int hashCode () {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    Usuario outroUsuario = (Usuario) obj;

    return this.nome.equals(outroUsuario.nome);
  }
}
