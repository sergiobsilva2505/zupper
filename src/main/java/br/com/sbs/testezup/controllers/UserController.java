package br.com.sbs.testezup.controllers;

import br.com.sbs.testezup.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    public User teste(){
        User user =new User(1, "Sergio Bezerra da Silva", "zedahora@gmail.com", "16958158822",
                LocalDate.of(1974,05,25));
        return user;
    }
}
