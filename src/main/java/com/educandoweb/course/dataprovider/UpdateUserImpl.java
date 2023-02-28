package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.UpdateUser;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import com.educandoweb.course.dataprovider.repository.entity.UserEntity;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UpdateUserImpl implements UpdateUser {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void update(UUID id, User user) {
        var userEntity = userRepository.getReferenceById(id);
        updateUser(user, userEntity);
        userRepository.save(userEntity);
    }

    private void updateUser(User user, UserEntity userEntity) {
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());

    }
}
