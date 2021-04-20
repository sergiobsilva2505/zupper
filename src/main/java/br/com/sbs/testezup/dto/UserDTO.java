package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.User;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class UserDTO {

    @NotEmpty(message = "Name cannot be null or empty.")
    private String name;

    @NotEmpty(message = "Email cannot be null or empty.")
    @Email
    private String email;

    @NotEmpty(message = "Cpf cannot be null or empty.")
    @CPF(message = "Type a valid CPF")
    private String cpf;

    @NotNull(message = "Birth date cannot be null or empty.")
    @Past(message = "Date must be in the past")
    private LocalDate dateOfBirth;

    public UserDTO() {
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

    public static User toUser(UserDTO objForm){
        User obj = new User(objForm.getName(), objForm.getEmail(), objForm.getCpf(), objForm.getDateOfBirth());
        return obj;
    }
}
