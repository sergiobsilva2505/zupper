package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *  Essa classe tem como objetivo, receber a entrada de dados do usuário e fazer a validação  desses dados.
 */
public class AddressDTO {

    @Autowired
    private UserService userService;

    @NotEmpty(message = "Public place is mandatory")
    private String publicPlace; // rua, avenida, praça, largo e etc. Equivale ao logradouro aqui no Brasil.

    @NotEmpty(message = "Number is mandatory")
    private String number;

    private String complement;

    @NotEmpty(message = "District is mandatory")
    private String district;

    @NotEmpty(message = "City is mandatory")
    private String city;

    @NotEmpty(message = "Uf is mandatory")
    @Size(min = 2, max = 2, message = "Abbreviation of the State with 2 character.")
    private String uf;

    @NotEmpty(message = "Zip code is mandatory")
    private String zipCode;

    @NotNull(message = "User id is mandatory")
    private Integer userId;

    public AddressDTO() {
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
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

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
