package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.DeleteUser;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteUserImpl implements DeleteUser {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void delete(UUID id) {

        userRepository.deleteById(id);

    }
}
