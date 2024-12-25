package JPA;

import JPA.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ObterUsuarios {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    List<Usuario> usuarios = entityManager
      .createQuery("select u from Usuario u", Usuario.class)
      .setMaxResults(5)
      .getResultList();

    for(Usuario usuario: usuarios) {
      System.out.println("| ID: " + usuario.getId() + " | E-mail: " + usuario.getEmail());
    }

    entityManager.close();
    entityManagerFactory.close();
  }
}
