package br.com.sbs.testezup.dto;

import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe tem como objetivo representar um User e seus Addresses, como resposta a requisição.
 */
public class UserResponseDTO {

    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate dateOfBirth;

    private List<AddressResponseDTO> addressDTOS;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.dateOfBirth = user.getDateOfBirth();
        this.addressDTOS = toAddressDTO(user.getAddresses());
    }

    /**
     * Esse método recebe como parametro a  lista de endereços que vem no objeto User passado no construtor dessa classe,
     * converte e retorna uma lista de objetos AddressResponseDTO, conformme especificação do padrão MVC.
     * @param list
     * @return
     */
    private List<AddressResponseDTO> toAddressDTO(List<Address> list){
        List<AddressResponseDTO> dtoList = new ArrayList<>();
        list.stream().forEach(address -> {
            dtoList.add(new AddressResponseDTO(address));
        });
        return dtoList;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<AddressResponseDTO> getAddressDTOS() {
        return addressDTOS;
    }
}
