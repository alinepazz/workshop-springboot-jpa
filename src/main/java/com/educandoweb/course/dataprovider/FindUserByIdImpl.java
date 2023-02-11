package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindUserById;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import com.educandoweb.course.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindUserByIdImpl implements FindUserById {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;


    @Override
    public Optional<User> findUserById(UUID id) {
        var userEntity = userRepository.findById(id);
        return userEntity.map(entity -> userEntityMapper.toUserById(entity));
    }
}
