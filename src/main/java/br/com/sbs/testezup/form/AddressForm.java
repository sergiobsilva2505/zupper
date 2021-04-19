package br.com.sbs.testezup.form;

import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.entities.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddressForm {

    private String publicPlace; // rua, avenida, praça, largo e etc. Equivale ao logradouro aqui no Brasil.
    private String number;
    private String complement;
    private String district;
    private String city; // TO DO outra tabela
    private String uf; // TO DO outra tabela
    private String zipCode;

    public AddressForm() {
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
        this.uf = uf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static Address toAddress(AddressForm objForm){
        Address obj = new Address(
                objForm.getPublicPlace(),
                objForm.getNumber(),
                objForm.getComplement(),
                objForm.getDistrict(),
                objForm.getCity(),
                objForm.getUf(),
                objForm.getZipCode()
        );
        return obj;
    }
}
