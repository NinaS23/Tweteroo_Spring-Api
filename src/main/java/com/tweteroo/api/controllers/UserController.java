package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.Users;
import com.tweteroo.api.repository.UserRepository;

import jakarta.validation.Valid;




@RestController
@RequestMapping("/sign-up")

public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void save(@RequestBody @Valid UserDTO req) {
      repository.save(new Users(req));
    }
    
}
