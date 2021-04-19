package br.com.sbs.testezup.exceptions;

public class UserFormException {

    private String campo;
    private String erro;

    public UserFormException(String campo) {
        this.campo = campo;
    }

    public UserFormException(String campo, String erro) {
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
