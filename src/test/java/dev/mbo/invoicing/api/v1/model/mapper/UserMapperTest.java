package dev.mbo.invoicing.api.v1.model.mapper;

import dev.mbo.invoicing.api.v1.model.UserDTO;
import dev.mbo.invoicing.model.User;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperTest {

  @Test
  void toDto() {
    final var entity = new User();
    entity.setId(UUID.randomUUID());
    entity.setName(UUID.randomUUID().toString());

    final var dto = UserMapper.MAPPER.toDestination(entity);
    assertThat(dto.getId()).isEqualTo(entity.getId());
    assertThat(dto.getName()).isEqualTo(entity.getName());
  }

  @Test
  void toEntity() {
    final var dto = new UserDTO();
    dto.setId(UUID.randomUUID());
    dto.setName(UUID.randomUUID().toString());

    final var entity = UserMapper.MAPPER.toSource(dto);
    assertThat(entity.getId()).isEqualTo(dto.getId());
    assertThat(entity.getName()).isEqualTo(dto.getName());
  }
}
