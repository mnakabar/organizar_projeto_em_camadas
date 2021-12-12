package com.developper.controller;

import com.developper.dto.UserDTO;
import com.developper.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices services;
    @GetMapping (value = "{id}")
    public UserDTO finfById(@PathVariable Long id){
        return  services.finfById(id);

    }
}
