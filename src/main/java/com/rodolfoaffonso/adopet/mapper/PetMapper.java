package com.rodolfoaffonso.adopet.mapper;

import com.rodolfoaffonso.adopet.domain.Pet;
import com.rodolfoaffonso.adopet.dto.PetDTO;


@org.mapstruct.Mapper(componentModel = "spring")
public interface PetMapper {

    Pet mapper(PetDTO petDTO) ;

    PetDTO mapper(Pet pet) ;

}
