package com.rodolfoaffonso.adopet.repository;

import com.rodolfoaffonso.adopet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet , Long> {
}
