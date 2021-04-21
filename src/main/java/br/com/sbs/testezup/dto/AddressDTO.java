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
    private String city; // TODO outra tabela

    @NotEmpty(message = "Uf is mandatory")
    @Size(min = 2, max = 2, message = "Abbreviation of the State with 2 character.")
    private String uf; // TODO outra tabela

    @NotEmpty(message = "Zip code is mandatory")
    private String zipCode;

    @NotNull(message = "User id is mandatory")
    private Integer userId;

    public AddressDTO() {
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Integer getUserId() {
        return userId;
    }

}
