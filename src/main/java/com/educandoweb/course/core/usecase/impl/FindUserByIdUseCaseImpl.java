package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindUserById;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.core.usecase.FindUserByIdUseCase;
import java.util.UUID;

public class FindUserByIdUseCaseImpl implements FindUserByIdUseCase {

    private final FindUserById findUserById;

    public FindUserByIdUseCaseImpl(FindUserById findUserById) {
        this.findUserById = findUserById;
    }


    @Override
    public User findById(UUID id) {
        return findUserById.findUserById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
