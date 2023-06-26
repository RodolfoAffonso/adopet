package com.rodolfoaffonso.adopet.controller;

import com.rodolfoaffonso.adopet.domain.Role;
import com.rodolfoaffonso.adopet.dto.UserDTO;
import com.rodolfoaffonso.adopet.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abrigos")
@AllArgsConstructor
public class ShelterController {

    private final UserService userService ;

    @PostMapping
    public ResponseEntity<UserDTO> createShelter(@RequestBody @Valid UserDTO userDTO){
        UserDTO tutorResponse = userService.create(userDTO, Role.ABRIGO);
        return ResponseEntity.ok(tutorResponse);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDTO> updateShelter(@PathVariable Long id , @RequestBody @Valid UserDTO abrigo ){
        UserDTO tutorResponse = userService.update(id, abrigo);
        return ResponseEntity.ok(tutorResponse);
    }

    @GetMapping
    public List<UserDTO> searchShelter(){
        return userService.search(Role.ABRIGO);

    }
    @GetMapping("/{id}")
    public UserDTO searchShelterById(@PathVariable Long id){
        return userService.searchById(id);
    }

    @DeleteMapping("/{id}")
    public UserDTO deleteShelterById(@PathVariable Long id){
        return userService.deleteById(id);
    }

}


