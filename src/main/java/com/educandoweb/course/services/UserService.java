package com.educandoweb.course.services;

import com.educandoweb.course.dtos.UserDto;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserDto userDto) {
        var user = new User();
        BeanUtils.copyProperties(userDto, user );
        userRepository.save(user);

    }

    public Page<User> getAll(Pageable pageable) {
       return userRepository.findAll(pageable);
    }
}
