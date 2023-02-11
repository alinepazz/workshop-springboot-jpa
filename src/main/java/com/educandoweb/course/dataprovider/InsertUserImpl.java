package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertUser;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import com.educandoweb.course.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserImpl implements InsertUser {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private  UserEntityMapper userEntityMapper;



    @Override
    public void insert(User user) {
        var userEntity = userEntityMapper.toUserEntity(user);
        userRepository.save(userEntity);

    }
}
