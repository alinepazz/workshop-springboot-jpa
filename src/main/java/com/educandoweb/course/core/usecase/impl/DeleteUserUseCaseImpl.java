package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.DeleteUser;
import com.educandoweb.course.core.usecase.DeleteUserUseCase;

import java.util.UUID;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final DeleteUser deleteUser;

    public DeleteUserUseCaseImpl(DeleteUser deleteUser) {
        this.deleteUser = deleteUser;
    }

    @Override
    public void delete(UUID id) {
        deleteUser.delete(id);
    }
}
