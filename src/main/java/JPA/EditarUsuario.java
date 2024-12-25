package JPA;

import JPA.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EditarUsuario {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    Usuario usuario = entityManager.find(Usuario.class, 1L);
    usuario.setNome("Tom Alexander");
    usuario.setEmail("tom@dev.com.br");
    entityManager.merge(usuario);

    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();
  }
}
