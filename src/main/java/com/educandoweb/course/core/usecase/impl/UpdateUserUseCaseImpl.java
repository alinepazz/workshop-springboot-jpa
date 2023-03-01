package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.UpdateUser;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.core.usecase.UpdateUserUseCase;
import com.educandoweb.course.dataprovider.exceptions.ResourceNotFoundException;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UpdateUser updateUser;

    public UpdateUserUseCaseImpl(UpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public void update(UUID id, User user) {
        try {
            updateUser.update(id, user);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }


    }
}
