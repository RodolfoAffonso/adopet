package com.rodolfoaffonso.adopet.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class NoneUserFoundException extends CustomException{
    public NoneUserFoundException() {
        super(HttpStatus.BAD_REQUEST, "Nenhum tutor encontrado !");
    }
}
