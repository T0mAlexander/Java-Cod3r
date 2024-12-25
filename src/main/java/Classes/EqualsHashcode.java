package Classes;

public class EqualsHashcode {
  public static void main(String[] args) {
    Usuario u1 = new Usuario();
    u1.nome = "Tom";
    u1.email = "tom@dev.com.br";

    Usuario u2 = new Usuario();
    u1.nome = "Rodrigo";
    u1.email = "rodrigo@dev.com.br";

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
    System.out.println(u2.equals(u1));
  }
}
