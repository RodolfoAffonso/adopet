package com.rodolfoaffonso.adopet.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @Where(clause = "role = 'abrigo'")
    private User abrigoId ;
    private String name ;
    private String descricao ;
    private PetSize petSize;
    private Boolean adopted = false ;
    private String age ;
    @ManyToOne
    private Address address;
    private String urlPicture;
}
