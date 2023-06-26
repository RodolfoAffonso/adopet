package com.rodolfoaffonso.adopet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    @NotNull @NotEmpty
    private String name ;
    @NotNull @NotEmpty @Pattern(regexp = "(\\d{2}) \\d{5}-\\d{4}")
    private String fone ;
    @NotNull @NotEmpty @Email()
    private String email ;
    @NotNull @NotEmpty @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{4,}$")
    private String password ;
    private String urlPicture ;
    @NotNull @NotEmpty
    private String about;
    private String role;
    private String dateCreate ;
}
