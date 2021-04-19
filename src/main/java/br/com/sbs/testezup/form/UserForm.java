package br.com.sbs.testezup.form;

import br.com.sbs.testezup.entities.User;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class UserForm {

    @NotEmpty(message = "Name cannot be null or empty.")
    private String name;
    @NotEmpty(message = "Email cannot be null or empty.")
    private String email;
    @NotEmpty(message = "Cpf cannot be null or empty.")
    private String cpf;
    //@NotEmpty(message = "Birth date cannot be null or empty.")
    private LocalDate dateOfBirth;

    public UserForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static User toUser(UserForm objForm){
        User obj = new User(objForm.getName(), objForm.getEmail(), objForm.getCpf(), objForm.getDateOfBirth());
        return obj;
    }
}
