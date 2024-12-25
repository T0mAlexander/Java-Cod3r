package JPA;

import JPA.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeletarUsuario {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Usuario usuario = entityManager.find(Usuario.class, 2L);

    if (usuario != null) {
      entityManager.getTransaction().begin();
      entityManager.remove(usuario);
      entityManager.getTransaction().commit();
      entityManager.close();
      entityManagerFactory.close();
    }
  }
}
