package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.User;

import java.time.LocalDate;

/**
 *  Essa classe tem como objetivo representar um objeto User como resposta ao usuário, logo após a inserção dos dados.
 */
public class NewUserResponseDTO {

    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate dateOfBirth;

    public NewUserResponseDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.dateOfBirth = user.getDateOfBirth();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
