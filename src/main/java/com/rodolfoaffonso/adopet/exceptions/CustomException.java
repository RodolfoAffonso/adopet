package com.rodolfoaffonso.adopet.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException{
    private HttpStatus httpStatus;
    private String messageError;

}
