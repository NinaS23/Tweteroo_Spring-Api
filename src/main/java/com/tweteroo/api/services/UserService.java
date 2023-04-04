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

    public Users save(UserDTO data) {
        return repository.save(new Users(data));
    }
}
