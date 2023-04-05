package com.tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.Users;
import com.tweteroo.api.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public String save(UserDTO data) {
        Users isUserExistent = repository.findByUsername(data.username());
        if (isUserExistent == null) {
             repository.save(new Users(data));
             return "OK";
        } else {
            return "user alredy exists";
        }
    }
}
