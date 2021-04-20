package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserResponseDTO {

    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate dateOfBirth;

    private List<AddressResponseDTO> addressDTOS;

    public UserResponseDTO(User user) {
        List<AddressResponseDTO> newList = new ArrayList<>();
        user.getAddresses().stream().forEach(address -> {
           newList.add(new AddressResponseDTO(address));
        });
        List<AddressResponseDTO> listRespDto = new ArrayList<>();
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.dateOfBirth = user.getDateOfBirth();
        this.addressDTOS = newList;
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

    public List<AddressResponseDTO> getAddressDTOS() {
        return addressDTOS;
    }

    public void setAddressDTOS(List<AddressResponseDTO> addressDTOS) {
        this.addressDTOS = addressDTOS;
    }
}