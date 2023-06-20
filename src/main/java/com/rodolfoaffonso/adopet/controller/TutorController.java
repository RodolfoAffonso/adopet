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

@AllArgsConstructor
@RestController
@RequestMapping("/tutores")
public class TutorController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> createTutors(@RequestBody @Valid UserDTO userDTO){
        UserDTO abrigoResponse = userService.create(userDTO, Role.TUTOR);
        return ResponseEntity.ok(abrigoResponse);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDTO> updateTutor(@PathVariable Long id , @RequestBody @Valid UserDTO userDTO){
        UserDTO abrigoResponse = userService.update(id, userDTO);
        return ResponseEntity.ok(abrigoResponse);
    }

    @GetMapping
    public List<UserDTO> searchTutor(){
       return userService.search(Role.TUTOR);

    }
    @GetMapping("/{id}")
    public UserDTO searchTutorById(@PathVariable Long id){
        return userService.searchById(id);
    }

    @DeleteMapping("/{id}")
    public UserDTO deleteTutorById(@PathVariable Long id){
        return userService.deleteById(id);
    }

}
