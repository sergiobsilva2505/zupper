package br.com.sbs.testezup.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HttpMessageNotReadableException  extends RuntimeException {
    private static final  long serialVersionUID = 1L;

    private final String message = "Date with incorrect format. Try: dd/mm/yyyy.";

    public HttpMessageNotReadableException (String message) {
        super(message);
    }
}
