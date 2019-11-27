package com.project.currencyconverter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidOperation extends RuntimeException {

    private ErrorCodes errorCodes;
    private String customMessage;


    public InvalidOperation(ErrorCodes errorCodes, String customMessage) {
        super(errorCodes + " " + customMessage);
        this.errorCodes = errorCodes;
        this.customMessage = customMessage;
    }
}
