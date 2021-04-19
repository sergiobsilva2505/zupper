package br.com.sbs.testezup.controllers;

import br.com.sbs.testezup.dto.AddressDTO;
import br.com.sbs.testezup.entities.Address;
import br.com.sbs.testezup.form.AddressForm;
import br.com.sbs.testezup.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/address")
public class AddressControler {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDTO> insert(@RequestBody AddressForm objForm){
        Address obj = AddressForm.toAddress(objForm);
        obj = addressService.insertAddress(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(new AddressDTO(obj));
    }

}
