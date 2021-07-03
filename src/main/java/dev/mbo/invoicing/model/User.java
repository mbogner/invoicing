package dev.mbo.invoicing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Entity
@Table(name = "users", uniqueConstraints = {
  @UniqueConstraint(name = "uc_users__name", columnNames = {"name"})
})
public class User {

  @Id
  private UUID id;

  @NotBlank
  @Column(name = "name", nullable = false)
  private String name;

}
