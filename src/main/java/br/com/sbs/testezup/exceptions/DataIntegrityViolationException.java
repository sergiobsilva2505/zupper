package br.com.sbs.testezup.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class DataIntegrityViolationException extends RuntimeException {
    private static final  long serialVersionUID = 1L;

    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
