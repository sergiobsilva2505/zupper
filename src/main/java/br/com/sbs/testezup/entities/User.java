package br.com.sbs.testezup.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements Serializable{

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    // @Column(unique = true) TODO
    private String cpf;

    // @Column(unique = true) TODO
    private LocalDate dateOfBirth;

    @OneToMany
    private List<Address> addresses = new ArrayList<>();

    public User() { }

    public User(Integer id, String name, String email, String cpf, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String name, String email, String cpf, LocalDate dateOfBirth) {
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

    public List<Address> getAddresses() {
        List<Address> lista = new ArrayList<>();
        lista.addAll(this.addresses);
        return lista;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
