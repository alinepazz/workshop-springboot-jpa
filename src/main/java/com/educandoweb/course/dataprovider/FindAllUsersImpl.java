package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindAllUsers;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import com.educandoweb.course.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class FindAllUsersImpl implements FindAllUsers {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;


    @Override
    public List<User> findAll() {
        var userEntity = userRepository.findAll();
        return userEntityMapper.toUser(userEntity);
    }
}
