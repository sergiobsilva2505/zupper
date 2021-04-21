package br.com.sbs.testezup.services;

import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.entities.User;
import br.com.sbs.testezup.dto.AddressDTO;
import br.com.sbs.testezup.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserService userService;


    public Address insertAddress(AddressDTO obj){
        Address address = addressRepository.save(toAddress(obj));
        return address;
    }

    /**
     *
     *  Quando chamado converte um objeto AddressDTO, que contém uma referencia para um objeto User
     *  como chave estrangeira, em um objeto Address como retorno.
     *  OBS:
     *  Esse processo não é executado na classe AddressDTO porque deverá ser feito uma busca de usuario por id,
     *  que foi passado como referencia no obj AddressDTO, e pra essa busca Deve ser instanciado um objeto
     *  UserService na classe AddressDTO que implicaria em ferir o padrao MVC.
     * @param obj
     * @return
     */
    private Address toAddress(AddressDTO obj){
        User user = userService.findById(obj.getUserId());
        Address address = new Address(
                obj.getPublicPlace(),
                obj.getNumber(),
                obj.getComplement(),
                obj.getDistrict(),
                obj.getCity(),
                obj.getUf(),
                obj.getZipCode(),
                user);
        return address;
    }

}
