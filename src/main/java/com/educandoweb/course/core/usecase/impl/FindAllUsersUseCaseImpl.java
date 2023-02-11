package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindAllUsers;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.core.usecase.FindAllUsersUseCase;
import org.springframework.data.domain.Page;

import java.util.List;

public class FindAllUsersUseCaseImpl implements FindAllUsersUseCase {

    private final FindAllUsers findAllUsers;

    public FindAllUsersUseCaseImpl(FindAllUsers findAllUsers) {
        this.findAllUsers = findAllUsers;
    }


    @Override
    public List<User> findAll() {
        return findAllUsers.findAll();
    }
}
