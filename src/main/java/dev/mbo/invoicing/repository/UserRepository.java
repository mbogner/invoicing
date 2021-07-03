package dev.mbo.invoicing.repository;

import dev.mbo.invoicing.model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class UserRepository {

  @Inject
  private EntityManager em;

  public List<User> findAll() {
    return em
      .createNamedQuery("user_findAll", User.class)
      .getResultList();
  }

}
