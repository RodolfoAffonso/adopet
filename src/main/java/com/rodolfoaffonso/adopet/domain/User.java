package com.rodolfoaffonso.adopet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name ;
    private String fone ;
    private String email ;
    private String password ;
    private String urlPicture ;
    private String about;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDateTime dateCreate = LocalDateTime.now();
}
