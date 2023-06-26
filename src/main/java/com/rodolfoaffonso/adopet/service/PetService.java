package com.rodolfoaffonso.adopet.service;

import com.rodolfoaffonso.adopet.domain.Pet;
import com.rodolfoaffonso.adopet.domain.User;
import com.rodolfoaffonso.adopet.dto.PetDTO;
import com.rodolfoaffonso.adopet.mapper.PetMapper;
import com.rodolfoaffonso.adopet.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class PetService {
    
    private final PetRepository petRepository ;
    private final PetMapper mapper ;

    public PetDTO create(PetDTO petDTO) {
        Pet pet = mapper.mapper(petDTO);
        Pet petSave = petRepository.save(pet);
        return mapper.mapper(petSave);
    }
}
