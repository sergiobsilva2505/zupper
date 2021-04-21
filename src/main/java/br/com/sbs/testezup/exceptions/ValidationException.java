package br.com.sbs.testezup.exceptions;

/**
 * Essa classe representa as mensagens a serem apresentadas ao usuario, quando ocorrerem erros de validação
 */
public class ValidationException {

    private String campo;
    private String erro;

    public ValidationException(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }
}
