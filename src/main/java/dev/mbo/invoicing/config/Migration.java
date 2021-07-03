package dev.mbo.invoicing.config;

import org.flywaydb.core.Flyway;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.sql.DataSource;

/**
 * Singleton bean with startup functionality to run migrations.
 * Tx management is set to BEAN to allow the non JTA transactions of flyway.
 */
@Singleton
@Startup
@TransactionManagement(TransactionManagementType.BEAN)
public class Migration {

  @Resource(lookup = "java:jboss/datasources/InvoicingDS")
  private DataSource dataSource;

  @PostConstruct
  public void startup() {
    final var flyway = Flyway.configure().dataSource(dataSource).load();
    flyway.migrate();
  }

}
