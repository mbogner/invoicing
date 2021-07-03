package dev.mbo.invoicing.api.v1.model;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
  private UUID id;
  private String name;
}
