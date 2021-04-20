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
        List<AddressResponseDTO> list = new ArrayList<>();
        for(Address address: user.getAddresses()){
            list.add(new AddressResponseDTO( address));
        }
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.dateOfBirth = user.getDateOfBirth();
        this.addressDTOS = list;
    }
}
