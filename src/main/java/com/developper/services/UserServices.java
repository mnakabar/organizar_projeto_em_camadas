package com.developper.services;

import com.developper.dto.UserDTO;
import com.developper.entities.User;
import com.developper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO finfById(Long id){
        User entities = repository.findById(id).get();
        UserDTO dto = new UserDTO(entities);
        return dto;
    }


}
