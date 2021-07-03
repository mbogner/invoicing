package dev.mbo.invoicing.config;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerResource {

  @Default
  @Produces
  @PersistenceContext(unitName = "InvoicingPU")
  private EntityManager em;

}
