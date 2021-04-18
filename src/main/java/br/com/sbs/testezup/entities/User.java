package br.com.sbs.testezup.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable{

    private  static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate dateOfBirth;

    public User() { }

    public User(Integer id, String name, String email, String cpf, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
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