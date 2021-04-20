package br.com.sbs.testezup.controllers;

import br.com.sbs.testezup.dto.NewUserResponseDTO;
import br.com.sbs.testezup.dto.UserResponseDTO;
import br.com.sbs.testezup.entities.User;
import br.com.sbs.testezup.dto.UserDTO;
import br.com.sbs.testezup.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/user")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findUserById(@PathVariable Integer id){
        User obj = userService.findById(id);
        return ResponseEntity.ok().body(new UserResponseDTO(obj));
    }

    @PostMapping
    public ResponseEntity<NewUserResponseDTO> insertUser(@Valid @RequestBody UserDTO userDTO){
        User obj = UserDTO.toUser(userDTO);
        obj = userService.insertUser(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(new NewUserResponseDTO(obj));
    }
}
