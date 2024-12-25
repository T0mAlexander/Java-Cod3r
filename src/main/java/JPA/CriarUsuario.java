package JPA;

import JPA.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CriarUsuario {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Usuario novoUsuario = new Usuario("Tom", "tom@java.com");

    entityManager.getTransaction().begin();
    entityManager.persist(novoUsuario);
    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();
  }
}