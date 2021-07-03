package dev.mbo.invoicing.api.v1.model.mapper;

import dev.mbo.invoicing.api.v1.model.UserDTO;
import dev.mbo.invoicing.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for books. Can not inherit methods from generic interface.
 */
@Mapper
public interface UserMapper {

  UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

  User toSource(final UserDTO entity);

  UserDTO toDestination(User dto);

  void map(
    UserDTO entity,
    @MappingTarget User dto
  );

  void map(
    User dto,
    @MappingTarget UserDTO entity
  );

}
