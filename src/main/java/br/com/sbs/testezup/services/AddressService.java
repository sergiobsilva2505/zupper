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

    private Address toAddress(AddressDTO objForm){
        User user = userService.findById(objForm.getUserId());
        Address obj = new Address(
                objForm.getPublicPlace(),
                objForm.getNumber(),
                objForm.getComplement(),
                objForm.getDistrict(),
                objForm.getCity(),
                objForm.getUf(),
                objForm.getZipCode(),
                user);
        return obj;
    }

}
