package br.com.sbs.testezup.exceptions;


import java.io.Serializable;

public class FormException implements Serializable {
    private static final long serialVersionUID = 1L;

    private String campo;
    private String erro;

    public FormException(String campo) {
        this.campo = campo;
    }

    public FormException(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
