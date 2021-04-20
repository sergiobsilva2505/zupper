package br.com.sbs.testezup.exceptions;

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

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
