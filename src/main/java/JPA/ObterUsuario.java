package JPA;

import JPA.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ObterUsuario {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Usuario usuario = entityManager.find(Usuario.class, 1L);
    System.out.println(usuario.getNome());
    entityManager.close();
    entityManagerFactory.close();
  }
}
