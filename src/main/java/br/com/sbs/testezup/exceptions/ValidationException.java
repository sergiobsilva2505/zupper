package br.com.sbs.testezup.exceptions;

/**
 * Essa classe representa as mensagens a serem apresentadas ao usuario quando 
 */
public class FormException {

    private String campo;
    private String erro;

    public FormException(String campo) {
        this.campo = campo;
    }

    public FormException(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }
}
