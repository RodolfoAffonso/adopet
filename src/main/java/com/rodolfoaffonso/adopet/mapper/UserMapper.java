package com.rodolfoaffonso.adopet.mapper;

import com.rodolfoaffonso.adopet.domain.User;
import com.rodolfoaffonso.adopet.dto.UserDTO;
import org.mapstruct.Mapping;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User mapper(UserDTO userDTO) ;

    UserDTO mapper(User user);
}
