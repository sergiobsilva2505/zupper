package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.Address;

/**
 *  Essa classe tem como objetivo representar um objeto Address como resposta ao usuário.
 */
public class AddressResponseDTO {

    private Integer id;
    private String publicPlace; // rua, avenida, praça, largo e etc. Equivale ao logradouro aqui no Brasil.
    private String number;
    private String complement;
    private String district;
    private String city; // TO DO outra tabela
    private String uf; // TO DO outra tabela
    private String zipCode;

    public AddressResponseDTO(Address address) {
        this.id = address.getId();
        this.publicPlace = address.getPublicPlace();
        this.number = address.getNumber();
        this.complement = address.getComplement();
        this.district = address.getDistrict();
        this.city = address.getCity();
        this.uf = address.getUf();
        this.zipCode = address.getZipCode();
    }

    public Integer getId() {
        return id;
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
}
