package com.rodolfoaffonso.adopet.exceptions;

import org.springframework.http.HttpStatus;

public class NotExistUserException extends CustomException{
    public NotExistUserException() {
        super(HttpStatus.NOT_FOUND, "Não existe um usuario com esse ID !");
    }
}
