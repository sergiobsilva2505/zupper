package br.com.sbs.testezup.services;

import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public Address insertAddress(Address obj){
        Address address = addressRepository.save(obj);
        return address;
    }

}
