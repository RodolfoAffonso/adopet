package com.rodolfoaffonso.adopet.controller;


import com.rodolfoaffonso.adopet.dto.PetDTO;
import com.rodolfoaffonso.adopet.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService ;

    @PostMapping
    public ResponseEntity <PetDTO> create(@RequestBody  PetDTO petDTO){
        PetDTO petResponse = petService.create(petDTO);
        return ResponseEntity.ok(petResponse);

    }

}
