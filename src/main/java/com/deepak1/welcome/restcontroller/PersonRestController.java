package com.deepak1.welcome.restcontroller;

import com.deepak1.welcome.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {
    @Autowired
    private PersonService service;

    @PostMapping("/person/check_email")    //checking the email
    public String checkDuplicateEmail(@Param("email") String email) {
        return service.isEmailUnique(email) ? "OK" : "Duplicated";
    }
}
