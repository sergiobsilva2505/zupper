package br.com.sbs.testezup.controllers;

import br.com.sbs.testezup.dto.AddressResponseDTO;
import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.dto.AddressDTO;
import br.com.sbs.testezup.services.AddressService;
import br.com.sbs.testezup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/address")
public class AddressControler {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<AddressResponseDTO> insert(@Valid @RequestBody AddressDTO objForm){
        Address obj = addressService.insertAddress(objForm);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(new AddressResponseDTO(obj));
    }

}
