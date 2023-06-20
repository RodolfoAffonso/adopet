package com.rodolfoaffonso.adopet.exceptions;

import org.springframework.http.HttpStatus;

public class ExistingEmailException extends CustomException {

    public ExistingEmailException(){
        super(HttpStatus.BAD_REQUEST, "Email já cadastrado");
    }
}
