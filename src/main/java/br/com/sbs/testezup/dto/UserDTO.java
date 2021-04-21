package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 *  Essa classe tem como objetivo, receber a entrada de dados do usuário e fazer a validação  desses dados.
 */
public class UserDTO {

    @NotEmpty(message = "Name cannot be null or empty.")
    private String name;

    @NotEmpty(message = "Email cannot be null or empty.")
    @Email(message = "Invalid email")
    private String email;

    @NotEmpty(message = "Cpf cannot be null or empty.")
    @CPF(message = "Type a valid CPF")
    private String cpf;

    @NotNull(message = "Birth date cannot be null or empty.")
    @Past(message = "Date must be in the past")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

    public UserDTO() {
    }

    /**
     *  Este método recebe um objeto UserDTO e converte para User
     * @param objForm
     * @return
     */
    public static User toUser(UserDTO objForm){
        User obj = new User(objForm.getName(), objForm.getEmail(), objForm.getCpf(), objForm.getDateOfBirth());
        return obj;
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
}
