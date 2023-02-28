package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.UpdateUser;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.core.usecase.UpdateUserUseCase;

import java.util.UUID;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UpdateUser updateUser;

    public UpdateUserUseCaseImpl(UpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public void update(UUID id, User user) {
        updateUser.update(id, user);

    }
}
