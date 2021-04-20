package br.com.sbs.testezup.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String publicPlace; // rua, avenida, praça, largo e etc. Equivale ao logradouro aqui no Brasil.
    private String number;
    private String complement;
    private String district;
    private String city; // TODO outra tabela
    private String uf; // TODO outra tabela
    private String zipCode;

    @ManyToOne
    @JoinColumn(name="user_id") // , nullable=false
    private User user;

    public Address() {
    }

    public Address(Integer id, String publicPlace, String number, String complement, String district, String city,
                   String uf, String zipCode) {
        this.id = id;
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.uf = uf;
        this.zipCode = zipCode;
    }

    public Address(String publicPlace, String number, String complement, String district, String city, String uf,
                   String zipCode, User user) {
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.uf = uf;
        this.user = user;
        this.zipCode = zipCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String state) {
        this.uf = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
